/*
 * Converts a string to all upper case letters.
 */
import java.util.Scanner;

class Upper {
        public static void main(String[] args) {
                String name;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                name = s.next();
                System.out.println("Uppercase: " + name.toUpperCase());
        }
}
