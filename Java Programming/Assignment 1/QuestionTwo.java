import java.util.Scanner;

/**
 * Find the average of 3 numbers.
 */
public class QuestionTwo {
    public static void main(String[] args) {
        Average avg1 = new Average();
        avg1.readNumbers();
        avg1.showAverage();
    }
}

class Average {
    private int num1, num2, num3;
    private double avg;

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            num1 = scanner.nextInt();

            System.out.print("Enter number 2: ");
            num2 = scanner.nextInt();

            System.out.print("Enter number 3: ");
            num3 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void showAverage() {
        avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of 3 numbers: " + avg);
    }
}