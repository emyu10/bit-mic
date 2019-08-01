/**
 * Read an array of integers and find the positive sum and negative sum.
 */
import java.util.Scanner;

class QuestionNine {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        int ps = 0, ns = 0;
        for (int i : a) {
            if (i > 0)
                ps += i;
            if (i < 0)
                ns += i;
        }

        System.out.println("Positive sum: " + ps);
        System.out.println("Negative sum: " + ns);
    }
}