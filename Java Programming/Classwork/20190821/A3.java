class PrintClass {
    public void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count = " + i);
        }
    }
}

class ABC extends Thread {
    String name;
    Thread t;
    PrintClass obj;

    ABC(String a, PrintClass b) {
        this.name = a;
        this.t = new Thread(this);
        this.obj = b;
    }

    public void start() {
        System.out.println("Thread starting: " + name);
        t.start();
    }

    public void run() {
        synchronized(obj) {
            obj.print();
        }
    }
}

class A3 {
    public static void main(String[] args) {
        PrintClass obj = new PrintClass();
        ABC ob1 = new ABC("One", obj);
        ABC ob2 = new ABC("Two", obj);
        ob1.start();
        ob2.start();
    }
}