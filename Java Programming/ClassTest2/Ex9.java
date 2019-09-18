import java.util.Scanner;

/**
 * Read a matrix, find diagonal element sum
 */
class Ex9 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                m[i][j] = s.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) sum += m[i][j];
            }
        }

        System.out.println("The sum of diagonal elements: " + sum);
    }
}