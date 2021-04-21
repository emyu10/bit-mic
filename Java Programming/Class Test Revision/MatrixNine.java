import java.util.Scanner;

class MatrixNine {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int needle;
        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter " + i + "," + j + ": ");
                a[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter number to search for: ");
        needle = s.nextInt();
        s.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 2; j >= 0; j--) {
                if (a[i][j] == needle) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println(needle + " found in matrix.");
        } else {
            System.out.println(needle + " not found in matrix.");
        }
        
    }
}