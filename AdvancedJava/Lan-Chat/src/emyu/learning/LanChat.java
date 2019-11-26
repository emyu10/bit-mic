package emyu.learning;

import emyu.learning.network.BroadcastClientThread;
import emyu.learning.network.BroadcastServerThread;
import emyu.learning.network.ClientThread;
import emyu.learning.network.OnReceiveBroadcastListener;
import emyu.learning.ui.ChatPane;
import emyu.learning.ui.UserPane;
import emyu.learning.ui.UserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.net.*;
import java.util.Enumeration;

public class LanChat extends JFrame {
    private JSplitPane appPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private UserPane userPane = new UserPane(this);
    private ChatPane chatPane = new ChatPane();
    private InetAddress broadcastIp;
    private InetAddress localIp;
    private String name;

    /**
     * The constructor.
     */
    private LanChat() {
        appPane.setLeftComponent(userPane);
        appPane.setRightComponent(chatPane);
        add(appPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 700);
        setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        initialize();
        startBroadcasting();
    }

    private void initialize() {
        try {
            Enumeration<NetworkInterface> nfaces = NetworkInterface.getNetworkInterfaces();
            while (nfaces.hasMoreElements()) {
                NetworkInterface nface = nfaces.nextElement();
                java.util.List<InterfaceAddress> ips = nface.getInterfaceAddresses();
                for (InterfaceAddress a : ips) {
                    if (a.getBroadcast() != null) {
                        broadcastIp = a.getBroadcast();
                        localIp = a.getAddress();
                    }
                }
            }
        } catch (SocketException e) {
            JOptionPane.showMessageDialog(this, "Could not initialize network connections. Closing the application now.", "Sorry", JOptionPane.ERROR_MESSAGE);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }


    private void startBroadcasting() {
        this.name = JOptionPane.showInputDialog(this, "Enter your preferred username");
        // construct a UserView with broadcast IP because the server needs to send to the broadcast ip
        (new BroadcastServerThread(new UserView(this.name, broadcastIp))).start();

        // broadcast client
        BroadcastClientThread thread = new BroadcastClientThread(localIp);
        thread.setOnReceiveBroadcastListener(new OnReceiveBroadcastListener() {
            @Override
            public void onReceive(DatagramPacket dp) {
                String name = new String(dp.getData(), 0, dp.getLength());
                InetAddress ip  = dp.getAddress();
                UserView user = new UserView(name, ip);
                userPane.add(user);
            }
        });
        thread.start();
    }

    /**
     * main method to launch the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LanChat c = new LanChat();
        (new ClientThread()).start();
    }
}
