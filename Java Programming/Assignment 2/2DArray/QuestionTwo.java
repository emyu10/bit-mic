
/**
 * Read a 3x3 integer array find the sum of all the elements.
 */
import java.util.Scanner;

class QuestionTwo {
    private static int[][] a = new int[3][3];

    public static void main(String[] args) {
        readMatrix();
        printSum();
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

    private static void printSum() {
        System.out.println("\nPrinting the sum\n-----------");
        int sum = 0;
        for (int[] r : a) {
            for (int c : r) {
                sum += c;
            }
        }
        System.out.println("The sum of array = " + sum);
    }
}