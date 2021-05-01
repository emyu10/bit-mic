import java.util.Scanner;

/**
 * Find the second smallest among 4 numbers entered by the user.
 */
public class QuestionTen {
    public static void main(String[] args) {
        SecondSmallest ss = new SecondSmallest();
        ss.readNumbers();
        ss.show();
    }
}

class SecondSmallest {
    private int num1, num2, num3, num4;

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

    public void show() {
        int sm1, sm2;
        sm1 = num1;
        if (num2 < sm1) {
            sm1 = num2;
            num2 = num3;
        }
        if (num3 < sm1) {
            sm1 = num3;
            num3 = num4;
        }
        if (num4 < sm1) {
            sm1 = num4;
            num4 = num1;
        }
        sm2 = num4;
        if (num1 != sm1 && num1 < sm2) sm2 = num1;
        if (num2 != sm1 && num2 < sm2) sm2 = num2;
        if (num3 != sm1 && num3 < sm2) sm2 = num3;
        if (num4 != sm1 && num4 < sm2) sm2 = num4;

        System.out.println("The second smallest number is " + sm2);
    }
}