/*
 * Find the biggest integer from an array of 5 integers.
 */
import java.util.Scanner;
class FindBiggest {
	public static void main(String[] args) {
		int biggest = 0, a[] = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number: ");
			a[i] = s.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			biggest = a[i] > biggest ? a[i] : biggest;
		}
		System.out.println("The biggest value is: " + biggest);
	}
}
