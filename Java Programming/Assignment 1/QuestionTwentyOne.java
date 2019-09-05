import java.util.Scanner;

/**
 * Factorial of a number.
 */
public class QuestionTwentyOne {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.readNumber();
        f.calculate();
    }
}
class Factorial {
    private int num;
    public void readNumber() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            num = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }
    public void calculate() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial is " + fact);
    }
}