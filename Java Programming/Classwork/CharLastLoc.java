/*
 * Find the location of the last occurence of a character
 * from a string.
 */
import java.util.Scanner;
class CharLastLoc {
        public static void main(String[] args) {
                String a;
                int b;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a string: ");
                a = s.next();
                b = a.lastIndexOf('o');
                System.out.println("Location of 'o' is " + b);
        }
}
