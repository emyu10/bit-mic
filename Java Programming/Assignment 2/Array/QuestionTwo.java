package Array;
import java.util.Scanner;

/**
 * Read an array of integers and print it in reverse.
 */
class QuestionTwo {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number: ");
            a[i] = s.nextInt();
        }
        s.close();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}