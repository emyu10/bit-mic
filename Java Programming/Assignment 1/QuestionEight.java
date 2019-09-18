/**
 * Find the biggest number among 4 numbers.
 */
import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Biggest b = new Biggest();
        b.readNumbers();
        b.showBiggest();
    }
}

class Biggest {
    private int num1, num2, num3, num4, biggest = 0;

    public void readNumbers() {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: ");
            num1 = s.nextInt();

            System.out.print("Enter number 2: ");
            num2 = s.nextInt();

            System.out.print("Enter number 3: ");
            num3 = s.nextInt();

            System.out.print("Enter number 4: ");
            num4 = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void showBiggest() {
        if (num1 > biggest) biggest = num1;
        if (num2 > biggest) biggest = num2;
        if (num3 > biggest) biggest = num3;
        if (num4 > biggest) biggest = num4;
        System.out.println("The biggest number is " + biggest);
    }
}