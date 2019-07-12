/*
 * Reverse a String.
 */
import java.util.Scanner;
class Reverse {
        public static void main(String[] args) {
                String name;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                name = s.next();
                for (int i = (name.length() - 1); i > 0; i--) {
                        System.out.println(name.charAt(i));
                }
        }
}
