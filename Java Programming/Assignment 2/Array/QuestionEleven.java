package Array;

import java.util.Scanner;

/**
 * Read an array of integers and count how many times a number is present.
 */
class QuestionEleven {
    public static void main(String[] args) {
        int[] a = new int[10];
        int needle;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        System.out.print("Enter number to search for: ");
        needle = s.nextInt();

        s.close();
        
        int count = 0;

        for (int i : a) {
            if (i == needle) {
                count++;
            }
        }

        System.out.println("The number " + needle + " is present " + count + " times in the array");
    }
}