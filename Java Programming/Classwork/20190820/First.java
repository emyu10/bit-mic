/**
 * Demonstrates creating threads by extending the Thread class.
 * Class ABC is the thread class in this example.
 */
class First {
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

class ABC extends Thread {    
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