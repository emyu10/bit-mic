import java.util.*;

/**
 * Read a Number. Find the Biggest Digit in that number.
 */
class Question05 {
    public static void main(String[] args) {
        int num, biggest = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scanner.nextInt();

        while (num > 0) {
            int digit = num % 10;
            if (digit > biggest)
                biggest = digit;
            num = num / 10;
        }

        System.out.println("The biggest digit is " + biggest);
    }
}