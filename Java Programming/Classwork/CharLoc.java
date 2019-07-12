import java.util.Scanner;
class CharLoc {
        public static void main(String[] args) {
                String a;
                int b;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter a string: ");
                a = s.next();
                b = a.indexOf('o');
                System.out.println("Location of 'o' is " + b);
        }
}
