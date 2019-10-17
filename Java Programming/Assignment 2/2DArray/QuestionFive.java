
/**
 * Read a 3x3 integer array and find number is present or not.
 */
import java.util.Scanner;

class QuestionFive {
    private static int[][] a = new int[3][3];
    private static int needle;

    public static void main(String[] args) {
        readMatrix();
        print();
        readNeedle();
        check();
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

    private static void readNeedle() {
        System.out.println("\nReading search number\n-----------");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter search number: ");
        needle = s.nextInt();
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

    private static void check() {
        System.out.println("\nChecking if number is present or not\n-----------");
        boolean found = false;
        for (int[] r : a) {
            for (int c : r) {
                if (c == needle) {
                    found = true;
                    break;
                }
                if (found)
                    break;
            }
        }
        if (found)
            System.out.println("Number " + needle + " found in array.");
        else
            System.out.println("Number " + needle + " NOT found in array.");
    }
}