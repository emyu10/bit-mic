import java.util.Scanner;

/**
 * Read an array, sort it in ascending order
 */
class Ex8 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + i + ": ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}