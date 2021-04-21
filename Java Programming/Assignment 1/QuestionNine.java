import java.util.Scanner;

/**
 * Find the smallest number among 5 numbers entered by the user.
 */
public class QuestionNine {
    public static void main(String[] args) {
        Smallest s = new Smallest();
        s.readNumbers();
        s.showSmallest();
    }
}

class Smallest {
    private int num1, num2, num3, num4, num5, smallest;

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

            System.out.print("Enter number 5: ");
            num5 = s.nextInt();
        } catch (Exception e) {
            System.out.println("Data type mismatch.");
        }
    }

    public void showSmallest() {
        smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;

        System.out.println("The smallest number is " + smallest);
    }
}