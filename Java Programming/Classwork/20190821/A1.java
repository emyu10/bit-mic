/**
 * This program demonstrates creating a thread by implementing the Runnable interface.
 * In this example, class ABC is the thread class. Class A1 is the main class.
 */
class ABC implements Runnable {
    String name;
    Thread t; 
    ABC(String a){
        name = a;
        t = new Thread(this);
    }

    public void start() {
        System.out.println("Thread starting: " + name);
        t.start();
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}

class A1 {
    public static void main(String[] args) {
        ABC ob1 = new ABC("One");
        ABC ob2 = new ABC("Two");
        ob1.start();
        ob2.start();
    }
}