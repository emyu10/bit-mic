import java.util.Scanner;

/**
 * Check if a number is Armstrong.
 */
public class QuestionTwentySix {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.readNumber();
        a.result();
    }
}
class Armstrong {
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
    private int sums() {
        String strNum = (new Integer(num)).toString();
        int times = strNum.length();
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            int digit = Integer.parseInt((new Character(strNum.charAt(i))).toString());
            int pro = 1;
            for (int j = 0; j < times; j++) {
                pro *= digit;
            }
            sum += pro;
        }
        return sum;
    }
    public void result() {
        int sumDigits = sums();
        if (sumDigits == num) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not Armstrong.");
        }
    }
}