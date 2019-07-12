/*
 * Compares 3 strings. Case sensivite.
 */
import java.util.Scanner;
class CompareThreeNames {
        public static void main(String[] args) {
                String a, b, c;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                a = s.next();
                System.out.print("Enter another name: ");
                b = s.next();
                System.out.print("Enter yet another name: ");
                c = s.next();
                if (a.compareTo(b) == 0 && a.compareTo(c) == 0) {
                        System.out.println("Same name");
                } else {
                        System.out.println("Different names");
                }
        }
}
