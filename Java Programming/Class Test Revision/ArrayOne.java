import java.util.Scanner;

class ArrayOne {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + i + ": ");
            a[i] = s.nextInt();
        }
        s.close();
        
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }

        System.out.println("The sum of array is " + sum);
    }
}