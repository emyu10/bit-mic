package Array;

import java.util.Scanner;

/**
 * Read an array of integers and count the number of even and odd numbers.
 */
class QuestionSix {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }

        s.close();
        
        int even = 0, odd = 0;

        for (int i: a) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        
        System.out.println("Count of Even numbers: " + even);
        System.out.println("Count of Odd numbers: " + odd);
    }
}