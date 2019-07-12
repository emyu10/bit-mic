import java.util.*;
class DiagonalSum {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int i, j, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				if (i == j) {
					sum += a[i][j];
				}
				if ((a.length - 1) - i == j) {
					if (i != j) {
						sum += a[i][j];
					}
				}
			}
		}
		
		System.out.println("Diagonal sum is " + sum);
	}
}