package Array;

import java.util.Scanner;

/**
 * Read an array of integers and print it.
 */
class QuestionOne {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }
        
        s.close();
        
        //printing the array
        for (int i: a) {
            System.out.println(i);
        }
    }
}