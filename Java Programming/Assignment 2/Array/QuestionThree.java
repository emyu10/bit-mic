package Array;

import java.util.Scanner;

/**
 * Read an array of integers and find the sum.
 */
class QuestionThree {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }
        s.close();
        int sum = 0;

        for (int i: a) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}