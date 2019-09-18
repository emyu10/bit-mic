package Array;

import java.util.Scanner;

/**
 * Read an array of integers and count how many numbers are divisible by 10.
 */
class QuestionFive {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        s.close();
        
        int count = 0;

        for (int i: a) {
            if (i % 10 == 0) {
                count++;
            }
        }

        System.out.println("Count of numbers divisible by 10: " + count);
    }
}