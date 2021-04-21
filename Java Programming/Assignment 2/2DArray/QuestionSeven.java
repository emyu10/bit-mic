
/**
 * Read a 3x3 integer array and find biggest and smallest elements.
 */
import java.util.Scanner;

class QuestionSeven {
    private static int[][] a = new int[3][3];

    public static void main(String[] args) {
        readMatrix();
        biggestAndSmallest();
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

    
    private static void biggestAndSmallest() {
        System.out.println("\nFinding biggest and smallest\n-----------");
        int biggest = a[0][0];
        int smallest = a[0][0];
        for (int[] r : a) {
            for (int c : r) {
                if (c > biggest)
                    biggest = c;
                if (c < smallest)
                    smallest = c;
            }
        }
        System.out.println("Biggest element: " + biggest);
        System.out.println("Smallest element: " + smallest);
    }
}