import java.util.Scanner;

/**
 * Read a matrix find even and odd sum
 */
class Ex3 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int even = 0, odd = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                m[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int element = m[i][j];
                if (element % 2 == 0) {
                    even += element;
                } else {
                    odd += element;
                }
            }
        }

        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
    }
}