import java.util.Scanner;

class ArrayThree {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int p = 0, n = 0, z = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }
        s.close();
        
        for (int i = 0; i < 10; i++) {
            if (a[i] == 0) {
                z++;
            } else {
                if (a[i] > 0) {
                    p++;
                } else {
                    n++;
                }
            }
        }

        System.out.println("Count of posivite numbers: " + p);
        System.out.println("Count of negative numbers: " + n);
        System.out.println("Count of zeroes: " + z);
    }
}