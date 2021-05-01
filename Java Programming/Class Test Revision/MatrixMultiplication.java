import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String... args) {
        MatrixMultiplication obj = new MatrixMultiplication();
        int[][] a = new int[3][3], b = new int[3][3], c = new int[3][3];

        System.out.println("\nRead matrix 1\n---------------");
        a = obj.read();
        System.out.println("\nRead matrix 2\n---------------");
        b = obj.read();

        System.out.println("\nPrinting matrix 1\n---------------");
        obj.print(a);
        System.out.println("\nPrinting matrix 2\n---------------");
        obj.print(b);

        c = obj.multiply(a, b);
        System.out.println("\nPrinting product matrix\n---------------");
        obj.print(c);
    }

    private int[][] read() {
        int[][] m = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for (" + i + ", " + j + "): ");
                m[i][j] = s.nextInt();
            }
        }
        return m;
    }

    private void print(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int[][] p = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    p[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return p;
    }
}