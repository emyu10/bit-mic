/*
 * Checks if the array contains a certain integer from an array of 5 integers.
 */
import java.util.Scanner;
class HasValue {
	public static void main(String[] args) {
		int[] a = new int[5];
		int b;
		boolean f = false;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a number: ");
			a[i] = s.nextInt();
		}

		System.out.print("Enter search number: ");
		b = s.nextInt();
		
		for (int val: a) {
			if (val == b) {
				f = true;
				break;
			}
		}
		
		if (f) {
			System.out.println("Number present");
		} else {
			System.out.println("Number not present");
		}
	}
}
