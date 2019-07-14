/*
 * To demonstrate method overloading.
 */
import java.util.*;
class MethodOverloadingOne {
    public static void main(String[] args) {
        Summer s = new Summer();
        s.sum();
        s.sum(1, 2);
        s.sum(1, 2, 3);
        s.sum(1, 2, 3, 4);
        
        MyPrinter p = new MyPrinter();
        p.print(1, 2);
        p.print(1, 'a');
        p.print(1, 'a', 2);
    }
}

class Summer {
    int a, b, c;
    
    public void sum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = s.nextInt();
        System.out.print("Enter number 2: ");
        b = s.nextInt();
        c = a + b;
        System.out.println("The sum is: " + c);
    }
    
    public void sum(int a, int b) {
        c = a + b;
        System.out.println("The sum is: " + c);
    }
    
    public void sum(int a, int b, int c) {
        this.c = a + b + c;
        System.out.println("The sum is: " + this.c);
    }
    
    public void sum(int a, int b, int c, int d) {
        this.c = a + b + c + d;
        System.out.println("The sum is: " + this.c);
    }
}

class MyPrinter {
    public void print(int a, int b) {
        System.out.println("Two integer types");
    }
    
    public void print(int a, char b) {
        System.out.println("One int, one char");
    }
    
    public void print(int a, char b, int c) {
        System.out.println("Two int, one char");
    }
}
