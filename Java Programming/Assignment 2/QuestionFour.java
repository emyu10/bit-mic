/**
 * Read array, insert a number to a specified postion.
 */
import java.util.Scanner;
class QuestionFour {
	private static final int MAX = 10;
	public static void main(String[] args) {
		int[] n = new int[100];
		int location, newNum;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < MAX; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			n[i] = s.nextInt();
		}
		printArray(n);
		
		System.out.print("Enter location: ");
		location = s.nextInt();
		
		System.out.print("Enter new number: ");
		newNum = s.nextInt();
		
		int tmp;
		
		for (int i = MAX; i >= location; i--) {
			n[i+1] = n[i];
			if (i == location) n[i] = newNum;
		}
		
		printArray(n);
	}
	
	public static void printArray(int[] n) {
		System.out.println("\nPrinting the array\n---------------");
		for (int i = 0; i < n.length; i++) {
			if (n[i] != 0) System.out.print(n[i] + " ");
		}
		System.out.println();
	}
} 