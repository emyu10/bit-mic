/**
 * Demonstrate java methods.
 * ------------------------
 * This program shows sum method with 2 arguments no return.
 */
import java.util.Scanner;
class Anr {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = s.nextInt();
        System.out.print("Enter B: ");
        b = s.nextInt();
        sum(a, b);
    }

    public static void sum(int a, int b) {
        System.out.println("The sum is " + (a + b));
    }
}