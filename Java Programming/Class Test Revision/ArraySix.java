import java.util.Scanner;

class ArraySix {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }
        s.close();
        
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}