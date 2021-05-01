import java.util.Scanner;

/**
 * Read a number and check if the number is 1, 2, 3 or 4 digits.
 */
public class QuestionFourteen {
    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        cd.readNumber();
        cd.count();
    }
}

class CountDigits {
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

    public void count() {
        int count = (new Integer(num)).toString().length();
        System.out.println("Number of digits: " + count);
    }
}