/**
 * Create a thread program to print 1 to 10, which includes start(), run(), isAlive() and join()
 */
class ABC implements Runnable {
    String name;
    Thread t;
    ABC(String a) {
        this.name = a;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class ThreadOne {
    public static void main(String[] args) {
        ABC obj1 = new ABC("one");
        ABC obj2 = new ABC("two");
        try {
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Exception occured");
        }
        
        System.out.println("Thread 1 active: " + obj1.t.isAlive());
        System.out.println("Thread 2 active: " + obj2.t.isAlive());
    }
}