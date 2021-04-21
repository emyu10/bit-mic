import java.util.Scanner;

/**
 * Read a number and find biggest digit.
 */
public class QuestionThirty {
    public static void main(String[] args) {
        BiggestDigit bd = new BiggestDigit();
        bd.readNumber();
        bd.show();
    }
}
class BiggestDigit {
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
        String strNum = (new Integer(num)).toString();
        int b = 0;
        for (int i = 0; i < strNum.length(); i++) {
            int digit = Integer.parseInt((new Character(strNum.charAt(i))).toString());
            if (digit > b) {
                b = digit;
            }
        }
        System.out.println("Biggest digit: " + b);
    }
}