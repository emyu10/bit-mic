
/**
 * Find the second largest among 3 numbers.
 */
import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        sl.readNumbers();
        sl.show();
    }
}

class SecondLargest {
    private int num1, num2, num3;

    public void readNumbers() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            num1 = s.nextInt();
            System.out.print("Enter number 2: ");
            num2 = s.nextInt();
            System.out.print("Enter number 3: ");
            num3 = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void show() {
        int b1 = 0, b2 = 0;
        if (num1 > b1) b1 = num1;
        if (num2 > b1) b1 = num2;
        if (num3 > b1) b1 = num3;

        if (num1 != b1 && num1 > b2) b2 = num1;
        if (num2 != b1 && num2 > b2) b2 = num2;
        if (num3 != b1 && num3 > b2) b2 = num3;

        System.out.println("Second largest number is " + b2);
    }
}
