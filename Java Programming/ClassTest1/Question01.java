import java.util.*;

/**
 * Read a number and generate its multiplication table.
 */
class Question01 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + num + "\n---------------------------");
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}