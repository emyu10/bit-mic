package emyu.learning.network;

import java.io.IOException;
import java.net.*;

public class BroadcastServerThread extends Thread {
    MulticastSocket ds;
    private InetAddress ip;

    public BroadcastServerThread(InetAddress ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int port = 50381;
                ds = new MulticastSocket(port);
                String broadcastMessage = "broadcasting";
                DatagramPacket dp = new DatagramPacket(broadcastMessage.getBytes(), broadcastMessage.length(), ip, port);
                ds.send(dp);
                Thread.sleep(1000);
                System.out.println("server running on: " + ip + ":" + port);
            } catch (Exception e) {
                System.out.println("from broadcast server: " + e.getMessage());
            } finally {
                if (ds != null)
                ds.close();
            }
        }
    }
}
