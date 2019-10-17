
/**
 * Read a 3x3 integer array and find even sum and odd sum.
 */
import java.util.Scanner;

class QuestionFour {
    private static int[][] a = new int[3][3];

    public static void main(String[] args) {
        readMatrix();
        print();
        printEvenSum();
        printOddSum();
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

    private static void printEvenSum() {
        System.out.println("\nPrinting even sum\n-----------");
        int sum = 0;
        for (int[] r : a) {
            for (int c : r) {
                if (c % 2 == 0)
                    sum += c;
            }
        }
        System.out.println("Even sum = " + sum);
    }

    private static void printOddSum() {
        System.out.println("\nPrinting odd sum\n-----------");
        int sum = 0;
        for (int[] r : a) {
            for (int c : r) {
                if (c % 2 != 0)
                    sum += c;
            }
        }
        System.out.println("Odd sum = " + sum);
    }
}