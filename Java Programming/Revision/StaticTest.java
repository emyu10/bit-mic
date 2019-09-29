class ABC {
    int a, b;
    static int c;

    public static void get() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    public void put() {
        a = 10;
        b = 20;
        c = 30;
    }
}

class StaticTest {
    public static void main(String[] args) {
        ABC o1 = new ABC();
        ABC o2 = new ABC();
        o1.put();
        o2.put();
        o1.get();
        o2.get();
    }
}