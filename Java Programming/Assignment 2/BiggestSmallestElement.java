/**
 * Read an array of integers and find the biggest and smallest number.
 */
import java.util.Scanner;
class BiggestSmallestElement {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter number " + (i + 1) + ":");
			nums[i] = s.nextInt();
		}
		System.out.println();
		biggest(nums);
		smallest(nums);
	}
	
	public static void biggest(int[] nums) {
		int biggest = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > biggest) biggest = nums[i];
		}
		System.out.println("Biggest number: " + biggest);
	}
	
	public static void smallest(int[] nums) {
		int smallest = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) smallest = nums[i];
			if (nums[i] < smallest) smallest = nums[i];
		}
		System.out.println("Smallest number: " + smallest);
	}
}