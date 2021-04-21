import java.util.Scanner;

/**
 * Find the sum of 5 numbers entered by the user.
 */
public class QuestionOne {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.readNumbers();
        sum.printSum();
    }
}

class Sum {
    private int num1, num2, num3, num4, num5, sum = 0;

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            num1 = scanner.nextInt();

            System.out.print("Enter number 2: ");
            num2 = scanner.nextInt();

            System.out.print("Enter number 3: ");
            num3 = scanner.nextInt();

            System.out.print("Enter number 4: ");
            num4 = scanner.nextInt();

            System.out.print("Enter number 5: ");
            num5 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void printSum() {
        sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum of 5 numbers: " + sum);
    }
}