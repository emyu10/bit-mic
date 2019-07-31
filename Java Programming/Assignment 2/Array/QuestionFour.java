/**
 * Read an array of integers and find the average.
 */
import java.util.Scanner;

class QuestionFour {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        int sum = 0;

        for (int i: a) {
            sum += i;
        }

        System.out.println("Average of array is " + ((float) sum/a.length));
    }
}