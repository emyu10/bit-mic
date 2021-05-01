
/**
 * Read a 3x3 integer array and find the transpose.
 */
import java.util.Scanner;

class QuestionThree {
    private static int[][] a = new int[3][3];

    public static void main(String[] args) {
        readMatrix();
        print();
        printTranspose();
    }

    private static void readMatrix() {
        System.out.println("\nRead a 3x3 matrix\n-------------");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                a[i][j] = s.nextInt();
            }
        }
    }

    private static void print() {
        System.out.println("\nPrinting\n-----------");
        for (int[] r : a) {
            for (int c : r) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    private static void printTranspose() {
        System.out.println("\nPrinting the transpose\n-----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + "\t");
            }
            System.out.println();
        }
    }
}