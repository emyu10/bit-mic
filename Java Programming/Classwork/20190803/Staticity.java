import java.util.*;
class Staticity {
    public static void main(String[] args) {
        Abc obj = new Abc("Obj1");
        obj.read();
        obj.print();
        
        Abc obj2 = new Abc("Obj2");
        obj2.read();
        obj2.print();
        obj.print();
    }
}

class Abc {
    int a, b;
    String cname;
    static int c = 30;

    Abc(String n) {
        this.cname = n;
    }
    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nReading values for " + cname + "\n---------------");
        System.out.print("Enter number A: ");
        a = s.nextInt();
        System.out.print("Enter number B: ");
        b = s.nextInt();
        System.out.print("Enter number C: ");
        c = s.nextInt();
    }

    public void print() {
        System.out.println("\nPrinting (" + cname + ") values\n---------------------");
        System.out.println("number A: " + a);
        System.out.println("number B: " + b);
        System.out.println("number C: " + c);
    }
}