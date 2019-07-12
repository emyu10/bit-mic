import java.util.Scanner;
class MatrixSum {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter number at [" + i + "][" + j + "]: ");
				a[i][j] = s.nextInt();
			}
		}

		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("The sum = " + sum);
	}
}