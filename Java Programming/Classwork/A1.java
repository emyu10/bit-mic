/*
 * Digit to day program.
 * Print the corresponding day when the user enters a digit from 1 to 7.
 * 1 is Sunday.
 */
import java.util.Scanner;

class A1 {
        public static void main(String p[]) {
                int a;
                Scanner s = new Scanner(System.in);
                System.out.print("Enter digit: ");
                a = s.nextInt();
                if (a == 1) System.out.print("Sunday");
                if (a == 2) System.out.print("Monday");
                if (a == 3) System.out.print("Tuesday");
                if (a == 4) System.out.print("Wednesday");
                if (a == 5) System.out.print("Thursday");
                if (a == 6) System.out.print("Friday");
                if (a == 7) System.out.print("Saturday");
        }
}
