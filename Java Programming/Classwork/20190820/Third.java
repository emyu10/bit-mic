class Third {
    public static void main(String[] args) {
        ABC z = new ABC();
        PQR ob1 = new PQR(z, "UK");
        PQR ob2 = new PQR(z, "USA");
        PQR ob3 = new PQR(z, "Maldives");
        PQR obj = new PQR(z, "Japan");
    }
}

class ABC {
    public synchronized void call(String a) {
        System.out.print("[ " + a);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print(" ]");
    }
}

class PQR implements Runnable {
    String a;
    ABC obj;
    Thread t;

    public PQR(ABC p, String s) {
        obj = p;
        a = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        obj.call(a);
    }
}