/*
 * This program checks the equality of 2 strings.
 * Comparison is case sensitive.
 */
import java.util.Scanner;
class CompareNames {
        public static void main(String[] args) {
                String a, b;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                a = s.next();
                System.out.print("Enter another name: ");
                b = s.next();
                if (a.compareTo(b) == 0) {
                        System.out.println("Same name");
                } else {
                        System.out.println("Different names");
                }
        }
}
