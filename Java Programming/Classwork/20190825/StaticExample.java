class StaticExample {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        A1 obj2 = new A1();
        A1 obj3 = new A1();
        obj1.b = 10;
        obj2.b = 20;
        obj3.b = 30;
        System.out.println("obj1 b = " + obj1.b);
        System.out.println("obj2 b = " + obj2.b);
        System.out.println("obj3 b = " + obj3.b);

        obj1.a = 100;
        obj2.a = 200;
        obj3.a = 300;
        System.out.println("obj1 a = " + obj1.a);
        System.out.println("obj2 a = " + obj2.a);
        System.out.println("obj3 a = " + obj3.a);
    }
}

class A1 {
    static int a;
    int b;
}