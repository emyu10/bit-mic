package emyu.learning.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BroadcastClientThread extends Thread {
    private MulticastSocket ds;
    private InetAddress localIp;

    public BroadcastClientThread(InetAddress localIp) {
        this.localIp = localIp;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ds = new MulticastSocket(50381);
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, 1024);
                ds.receive(dp);
                String str = new String(dp.getData(), 0, dp.getLength());

                if (!dp.getAddress().equals(localIp)) {
                    System.out.println(str + ":" + dp.getAddress());
                }
            } catch (Exception e) {
                System.out.println("from broadcast client: " + e.getMessage());
            } finally {
                if (ds != null)
                    ds.close();
            }
        }
    }
}
