import java.util.Scanner;

/**
 * Read an array, find the smallest element
 */
class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + i + ": ");
            a[i] = s.nextInt();
        }

        int smallest = a[0];
        for (int i = 0; i < 5; i++) smallest = a[i] < smallest ? a[i] : smallest;

        System.out.println("The smallest number in array: " + smallest);
    }
}