/*
 * Sums the corresponding elements of 2 two dimensional arrays and generate another
 * 2 dimensional array with the sums and print the new array.
 */
import java.util.*;
class SumMatrices {
	public static void main(String[] args) {
		int[][] a = new int[3][3], b = new int[3][3], c = new int[3][3];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Enter value for array a at " + i + "," + j + ": ");
				a[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print("Enter value for array b at " + i + "," + j + ": ");
				b[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
