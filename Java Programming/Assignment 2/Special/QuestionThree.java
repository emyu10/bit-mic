package Special;

import java.util.Scanner;

/**
 * Read an array. Delete a number from a location. Print the balance.
 */
class QuestionThree {
    private static final int MAX = 10;

    public static void main(String[] args) {
        int[] nums = new int[MAX];
        int location;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = s.nextInt();
        }

        displayArray(nums);

        System.out.print("Enter location to delete: ");
        location = s.nextInt();

        for (int i = location; i < nums.length; i++) {
            if (i == nums.length - 1) nums[i] = 0;
            else nums[i] = nums[i + 1];
        }

        System.out.println("\nNew values");

        displayArray(nums);
        s.close();
    }

    public static void displayArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}