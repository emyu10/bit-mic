/**
 * Demonstrates creating a thread by implementing the Runnable interface.
 * Class ABC is the thread class in this example.
 */
class Second {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.start();
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Main " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class ABC implements Runnable {
    private Thread t;
    
    public void start() {
        t = new Thread(this);
        t.start();
    }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}