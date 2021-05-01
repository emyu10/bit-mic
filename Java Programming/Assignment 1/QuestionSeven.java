import java.util.Scanner;

/**
 * Find if entered number is positive or negative.
 */
public class QuestionSeven {
    public static void main(String[] args) {
        PosNeg pn = new PosNeg();
        pn.readNumber();
        pn.show();
    }
}

class PosNeg {
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

    public void show() {
        if (num == 0) {
            System.out.println("Number " + num + " is neither positive nor negative.");
        } else if (num > 0) {
            System.out.println("Number " + num + " is positive.");
        } else {
            System.out.println("Number " + num + " is negative.");
        }
    }
}