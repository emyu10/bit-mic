import java.util.Scanner;

class MatrixSeven {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int es = 0, os = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + "," + j + ": ");
                a[i][j] = s.nextInt();
            }
        }

        s.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (a[i][j] % 2 == 0) es += a[i][j];
                else os += a[i][j];
            }
        }

        System.out.println("Sum of even numbers " + es);
        System.out.println("Sum of odd numbers " + os);
    }
}