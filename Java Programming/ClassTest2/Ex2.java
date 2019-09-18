import java.util.Scanner;

/**
 * Read an array find the average.
 */
class Ex2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int sum = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + i + ": ");
            nums[i] = s.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        float avg = sum/nums.length;
        System.out.println("The average of array is: " + avg);
    }
}