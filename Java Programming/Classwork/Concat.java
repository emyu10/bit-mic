/*
 * Concatenate or join strings.
 */
import java.util.Scanner;
public class Concat {
        public static void main(String[] args) {
                String a, b, c;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter first name: ");
                a = s.next();
                System.out.print("Enter second name: ");
                b = s.next();
                System.out.print("Enter third name: ");
                c = s.next();
                System.out.println("Full name: " + a + " " + b + " " + c);
        }
}
