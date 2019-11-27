package emyu.learning;

import emyu.learning.network.BroadcastServerThread;
import emyu.learning.network.ClientThread;
import emyu.learning.ui.ChatPane;
import emyu.learning.ui.UserPane;
import emyu.learning.ui.UserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.net.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

public class LanChat extends JFrame {
    private JSplitPane appPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private UserPane userPane = new UserPane(this);
    private ChatPane chatPane = new ChatPane();
    private InetAddress broadcastIp;
    private InetAddress localIp;
    private String name;
    private HashMap<InetAddress, UserView> users = new HashMap<>();

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
//        userPane.addUser(new UserView("emyu", localIp));
        this.name = JOptionPane.showInputDialog(this, "Enter your preferred username");
        // construct a UserView with broadcast IP because the server needs to send to the broadcast ip
        (new BroadcastServerThread(new UserView(this.name, broadcastIp))).start();

        SwingWorker<Void, DatagramPacket> broadcastClient = new SwingWorker<Void, DatagramPacket>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (true) {
                    MulticastSocket ds = new MulticastSocket(AppConstants.BROADCAST_PORT);
                    byte[] buf = new byte[1024];
                    DatagramPacket dp = new DatagramPacket(buf, 1024);
                    ds.receive(dp);
                    if (!dp.getAddress().equals(localIp)) {
                        publish(dp);
                    }
                }
            }

            @Override
            protected void process(List<DatagramPacket> chunks) {
                for (DatagramPacket dp: chunks) {
                    String name = new String(dp.getData(), 0, dp.getLength());
                    InetAddress ip  = dp.getAddress();
                    UserView user = new UserView(name, ip);
                    if (!users.containsKey(ip)) {
                        users.put(ip, user);
                        userPane.addUser(user);
                        System.out.println(user);
                    }
                }
            }
        };

        broadcastClient.execute();
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