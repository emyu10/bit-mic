/**
 * Demonstrate java methods.
 * ------------------------
 * This program shows sum method with 2 arguments and int return type.
 */
import java.util.Scanner;
class Awr {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = s.nextInt();
        System.out.print("Enter B: ");
        b = s.nextInt();
        System.out.println("Sum is " + sum(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}