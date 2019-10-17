import java.util.Scanner;

class MatrixEight {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3], b = new int[3][3];

        System.out.println("Read first array\n----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + "," + j + ": ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("\nRead second array\n----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + "," + j + ": ");
                b[i][j] = s.nextInt();
            }
        }

        s.close();

        System.out.println("\nPrinting the sum of 2 arrays\n----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j] + b[i][j]) + "\t");
            }
            System.out.println("");
        }
    }
}