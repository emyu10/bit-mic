/*
 * Transpose a 2 dimensional array.
 */
import java.util.Scanner;
class MatrixTranspose {
	public static void main(String[] args) {
		int[][] a = new int[3][3];

		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter number at [" + i + "][" + j + "]: ");
				a[i][j] = s.nextInt();
			}
		}

		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
