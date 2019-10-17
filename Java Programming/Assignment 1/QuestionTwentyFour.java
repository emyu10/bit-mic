import java.util.Scanner;

/**
 * Sum of digits of a number.
 */
public class QuestionTwentyFour {
    public static void main(String[] args) {
        SumOfDigits sod = new SumOfDigits();
        sod.readNumber();
        sod.showSum();
    }
}
class SumOfDigits {
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
    public void showSum() {
        int sum = 0;
        String strNum = (new Integer(num)).toString();
        for (int i = 0; i < strNum.length(); i++) {
            sum += Integer.parseInt((new Character(strNum.charAt(i))).toString());
        }
        System.out.println("The sum of digits: " + sum);
    }
}