/*
 * Sums up the integers of an array.
 */
import java.util.Scanner;
class SumArray {
	public static void main(String[] args) {
		int a[] = new int[10];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			a[i] = s.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			sum += a[i];
		}
		System.out.println("The sum of the array is: " + sum);
	}
}
