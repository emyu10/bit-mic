/*
 * Inheritence example 2
 * Sum of three numbers
 */
import java.util.*;
//base class
class A {
    int a, b, c;
    void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = s.nextInt();
        System.out.print("Enter number 2: ");
        b = s.nextInt();
        System.out.print("Enter number 3: ");
        c = s.nextInt();
        
        System.out.println("all numbers read ...");
    }
}

//derived class
class B extends A {
    int d = 0;
    void display() {
        read();
        d = a + b + c;
        System.out.println("The sum is " + d);
    }
}

class C1Mod {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
