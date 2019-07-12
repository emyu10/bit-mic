import java.util.Scanner;
class CompareWithoutCase {
        public static void main(String[] args) {
                String a, b;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a name: ");
                a = s.next();
                System.out.print("Enter another name: ");
                b = s.next();
                if (a.compareToIgnoreCase(b) == 0) {
                        System.out.println("Same name");
                } else {
                        System.out.println("Not same name");
                }
        }
}
