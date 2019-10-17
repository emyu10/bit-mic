package Array;

import java.util.Scanner;

/**
 * Read an array of integers and check if a number is present or not.
 */
class QuestionTen {
    public static void main(String[] args) {
        int[] a = new int[10];
        int needle;
        boolean found = false;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        System.out.print("Enter number to search: ");
        needle = s.nextInt();

        s.close();
        for (int i : a) {
            if (i == needle) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number present");
        } else {
            System.out.println("Number NOT present");
        }
    }
}