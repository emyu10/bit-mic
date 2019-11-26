package emyu.learning.network;

import emyu.learning.AppConstants;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BroadcastClientThread extends Thread {
    private MulticastSocket ds;
    private InetAddress localIp;
    private OnReceiveBroadcastListener listener;

    public BroadcastClientThread(InetAddress localIp) {
        this.localIp = localIp;
    }

    public void setOnReceiveBroadcastListener(OnReceiveBroadcastListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ds = new MulticastSocket(AppConstants.BROADCAST_PORT);
                byte[] buf = new byte[1024];
                DatagramPacket dp = new DatagramPacket(buf, 1024);
                ds.receive(dp);

                if (!dp.getAddress().equals(localIp)) {
                    if (listener != null) {
                        listener.onReceive(dp);
                    }
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
