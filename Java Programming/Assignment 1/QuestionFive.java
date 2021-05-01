import java.util.Scanner;

/**
 * Find if entered number is even or odd.
 */
public class QuestionFive {
    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();
        eo.readNumber();
        eo.show();
    }
}

class EvenOdd {
    private int num = 0;

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
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}