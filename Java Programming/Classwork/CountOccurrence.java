/*
 * Counts the number of occurences of a number in an array of 5 integers.
 * Array is loaded by getting user input.
 */
import java.util.Scanner;
class CountOccurrence {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b;
		int f = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a number: ");
			a[i] = s.nextInt();
		}

		System.out.print("Enter search number: ");
		b = s.nextInt();
		
		for (int val: a) {
			if (val == b) {
				f++;
			}
		}
		
		
		System.out.println("Result = " + f);
	}
}
