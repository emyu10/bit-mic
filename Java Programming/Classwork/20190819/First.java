/**
 * Demonstrates creating a thread by implementing the Runnable interface.
 * ABC is the thread class.
 */
class ABC implements Runnable {
    Thread t;
    ABC() {
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class First {
    public static void main(String[] args) {
        ABC a = new ABC();
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}