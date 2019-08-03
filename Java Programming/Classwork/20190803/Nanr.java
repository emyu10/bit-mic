/**
 * Demonstrate java methods.
 * ------------------------
 * This program shows no argument, no return methods
 */
import java.util.Scanner;
class Nanr {
    static int a, b, c;
    public static void main(String[] args) {
        read();
        print();
    }

    static void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = s.nextInt();
        System.out.print("Enter B: ");
        b = s.nextInt();
    }

    static void print() {
        c = a + b;
        System.out.println("Sum is " + c);
    }
}