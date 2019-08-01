import java.util.Scanner;

class QuestionFive {
	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int[][] sums = new int[4][4];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print("Enter number (" + i + ", " + j + "): ");
				n[i][j] = s.nextInt();
			}
		}

		printArray(n);

		// calculating the sum
		System.out.println("\nCalculating sums ...");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				sums[i][j] = n[i][j];
				sums[i][3] += n[i][j];
			}
		}

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				sums[3][i] += n[j][i];
			}
			if (i < 3) {
				sums[3][3] += sums[i][3];
				sums[3][3] += sums[3][i];
			}
		}

		printArray(sums);
	}
	
	public static void printArray(int[][] n) {
		System.out.println("\n\nPrinting Array\n--------------");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			System.out.println();
		}
	}
}