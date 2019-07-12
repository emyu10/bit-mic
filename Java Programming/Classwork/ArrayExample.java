/*
 * This is an example of an 2 dimensional array.
 * It scans integers from the keyboard and assigns the values into
 * positions in the array and then prints it to the console.
 */
import java.util.Scanner;

class ArrayExample {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		
		Scanner s = new Scanner(System.in);
		
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Enter number " + (r + 1) + " x " + (c + 1) + ": ");
				a[r][c] = s.nextInt();
			}
		}
		
		System.out.println("\nThe matrix is\n---------------");

		for (int r = 2; r >= 0; r--) {
			for (int c = 2; c >= 0; c--) {
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
	}
}
