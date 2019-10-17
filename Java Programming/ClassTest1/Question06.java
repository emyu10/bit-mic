import java.util.*;

/**
 * Use class method to create a Java program to find sum of digits of a given
 * number.
 */
class Question06 {
    public static void main(String[] args) {
        SumDigits sd = new SumDigits();
        sd.read();
        sd.sum();
    }
}

class SumDigits {
    int num;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = scanner.nextInt();
    }

    public void sum() {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}