/**
 * Read a 3x3 integer array and print it in reverse.
 */
import java.util.Scanner;

class QuestionOne {
    private static int[][] a = new int[3][3];

    public static void main(String[] args) {
        readMatrix();
        print();
        printInReverse();
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

    private static void printInReverse() {
        System.out.println("\nPrinting in reverse\n-----------");
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}