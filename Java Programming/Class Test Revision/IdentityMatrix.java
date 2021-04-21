import java.util.Scanner;

class IdentityMatrix {
    public static void main(String... args) {
        int[][] m = new int[3][3], n = new int[3][3], o = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
    
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter array element: ");
                m[i][j] = s.nextInt();
            }
        }

        // multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    n[i][j] = n[i][j] + (m[i][k] * o[k][j]);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
    }
}