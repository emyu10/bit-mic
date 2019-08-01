
/**
 * Matrix multiplication
 * 
 * 1 2 3 | 5 6 7 | (1x5+2x8+3x9) (1x6+2x9+3x7) (1x7+2x1+3x3)
 * 4 5 6 | 8 9 1 | (4x5+5x8+6x9) (4x6+5x9+6x7) ()
 * 7 8 9 | 9 7 3 | () () ()
 * 
 * c[i][j] = c[i][j] + (a[i][k] * b[k][j])
 */
import java.util.Scanner;
class QuestionSeven {
    private static final int SIZE = 3;
    private static int[][] a = new int[SIZE][SIZE];
    private static int[][] b = new int[SIZE][SIZE];
    private static int[][] c = new int[SIZE][SIZE];

    public static void main(String[] args) {
        System.out.println("Reading matrix A");
        a = readMatrix();

        System.out.println("Reading matrix B");
        b = readMatrix();

        printMatrix(a, "A");
        printMatrix(b, "B");

        initProductMatrix();
        multiply();
        printMatrix(c, "C");
    }

    private static int[][] readMatrix() {
        Scanner s = new Scanner(System.in);
        int[][] n = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("Enter number (" + i + "," + j + "):");
                n[i][j] = s.nextInt();
            }
        }
        return n;
    }

    private static void printMatrix(int[][] m, String name) {
        System.out.println("\nPrinting matrix " + name + "\n-----------------");
        for (int[] row: m) {
            for (int col: row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    private static void multiply() {
        for (int i = 0; i < SIZE; i++) {
            int r = i % SIZE;
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
    }

    private static void initProductMatrix() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                c[i][j] = 1;
            }
        }
    }
}