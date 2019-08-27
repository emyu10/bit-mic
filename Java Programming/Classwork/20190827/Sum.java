/**
 * Sum of 2 numbers including finally & finally.
 */
import java.util.Scanner;
import java.io.*;
class Sum {
    public static void main(String... args) {
        Abc o = new Abc();
        o.read();
        o.print();
        // try {
        //     o.testRuntime();
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        
        o = null;
        System.gc(); // garbage collector
    }
}

final class Abc {
    int a;
    int b;

    public void read() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            a = s.nextInt();
            System.out.print("Enter number 2: ");
            b = s.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Closing the scanner ...");
            s.close();
        }
    }

    public void print() {
        System.out.println("The sum of a and b is " + (a + b));
    }

    public void finalize() {
        System.out.println("object destruction");
    }

    // public void testRuntime() throws IOException {
    //     Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
    // }
}