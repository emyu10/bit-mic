/**
 * Demonstrate java methods.
 * ------------------------
 * This program shows a method print() with no arguments and a return type.
 */
import java.util.Scanner;
class Nar {
    static int a, b, c;
    public static void main(String[] args) {
        read();
        System.out.println("The sum is " + print());
    }

    // no argument, no return
    static void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = s.nextInt();
        System.out.print("Enter B: ");
        b = s.nextInt();
    }

    // a method with no arguments with a return type of int
    static int print() {
        return a + b;
    }
}