import java.util.Scanner;

/**
 * Read a matrix, find transpose
 */
class Ex6 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                m[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[j][i] + "\t");
            }
            System.out.println();
        }
    }
}