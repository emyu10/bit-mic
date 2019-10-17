import java.util.Scanner;

class ArrayTwo {
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
            if (a[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Count of even numbers: " + even);
        System.out.println("Count of odd numbers: " + odd);
    }
}