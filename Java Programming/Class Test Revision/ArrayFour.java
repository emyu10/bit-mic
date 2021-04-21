import java.util.Scanner;

class ArrayFour {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int even = 0, odd = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }
        s.close();
        
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) even += a[i];
            else odd += a[i];
        }

        System.out.println("Even sum: " + even);
        System.out.println("Odd sum: " + odd);
    }
}