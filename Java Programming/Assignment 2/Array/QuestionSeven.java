/**
 * Read an array of integers and find the sum of even numbers and odd numbers separately.
 */
import java.util.Scanner;

class QuestionSeven {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        int evenSum = 0, oddSum = 0;
        for (int i : a) {
            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}