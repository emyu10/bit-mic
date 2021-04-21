package Special;

import java.util.Scanner;

/**
 * Read array - sort in descending order.
 */
class QuestionOne {
	public static void main(String[] args) {
		int[] n = new int[10];
		Scanner s = new Scanner(System.in);
		
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            n[i] = s.nextInt();
        }
        s.close();
		printArray(n);
		n = sortDesc(n);
		printArray(n);
	}
	
	public static int[] sortDesc(int[] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] > n[i]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		return n;
	}
	
	public static void printArray(int[] n) {
		System.out.println("\nPrinting the array");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
}