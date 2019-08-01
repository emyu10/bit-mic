
/**
 * Read two 3x3 integer array and then perform matrix subtraction.
 */
import java.util.Scanner;

class QuestionSix {
    private static int[][] a = new int[3][3];
    private static int[][] b = new int[3][3];
    private static int[][] diff = new int[3][3];

    public static void main(String[] args) {
        a = readMatrix("A");
        b = readMatrix("B");
        print(a, "A");
        print(b, "B");
        findDifference();
        print(diff, "Sum");
    }

    private static int[][] readMatrix(String name) {
        System.out.println("\nRead 3x3 matrix (" + name + ")\n-------------");
        int[][] num = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                num[i][j] = s.nextInt();
            }
        }
        return num;
    }

    private static void print(int[][] num, String name) {
        System.out.println("\nPrinting (" + name + ")\n-----------");
        for (int[] r : num) {
            for (int c : r) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    private static void findDifference() {
        System.out.println("\nFinding Sum...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                diff[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}