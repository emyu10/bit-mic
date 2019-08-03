/*
 * Inheritence example.
 * Shows a simple (useless) base class and
 * another class that extends it just to print some
 * strings onto the console.
 */
import java.util.*;
class A1 {
    void print() {
        System.out.println("Jaufar");
    }
}

class B1 extends A1 {
    void display() {
        System.out.println("Jazlaan");
    }
}

class C1 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();
        obj.print();
    }
}
