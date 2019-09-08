import java.util.Scanner;

class MatrixThree {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int small;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + "," + j + ": ");
                a[i][j] = s.nextInt();
            }
        }

        s.close();
        
        small = a[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] < small) small = a[i][j];
            }
        }

        System.out.println("The smallest in array is " + small);
    }
}