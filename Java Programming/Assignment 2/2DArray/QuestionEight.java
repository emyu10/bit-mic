
/*
 * Read a 3x3 array of integers and find the diagonal sum.
 */
import java.util.Scanner;

class QuestionEight {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int i, j, sum = 0;
        Scanner s = new Scanner(System.in);
        
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print("Enter number (" + i + "," + j + "): ");
                a[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
                if ((a.length - 1) - i == j) {
                    if (i != j) {
                        sum += a[i][j];
                    }
                }
            }
        }

        System.out.println("Diagonal sum is " + sum);
    }
}