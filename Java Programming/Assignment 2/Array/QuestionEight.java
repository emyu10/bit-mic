package Array;

import java.util.Scanner;

/**
 * Read an array of integers. Count how many positive numbers and how many
 * negative numbers are there.
 */
class QuestionEight {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }
        
        s.close();

        int cp = 0, cn = 0;
        for (int i : a) {
            if (i > 0)
                cp++;
            if (i < 0)
                cn++;
        }

        System.out.println("Count of postive numbers: " + cp);
        System.out.println("Count of negative numbers: " + cn);
    }
}