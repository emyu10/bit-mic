/**
 * Read an array. Delete a number from a location. Print the balance.
 */
import java.util.Scanner;
class ArrayRemoveElement {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int location;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			nums[i] = s.nextInt();
		}
		
		displayArray(nums);
		
		System.out.print("Enter location to delete: ");
		location = s.nextInt();
		
		nums[location] = 0;
		
		System.out.println("\nNew values");
		
		displayArray(nums);
	}
	
	public static void displayArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
	}
}