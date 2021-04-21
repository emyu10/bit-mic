import java.util.Scanner;

class ArrayEight {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int b = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }

        s.close();
        
        for (int i = 0; i < 10; i++) {
            if (a[i] > b) {
                b = a[i];
            }
        }

        System.out.println("The biggest in array is " + b);
    }
}