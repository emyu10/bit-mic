import java.util.Scanner;

/**
 * Reverse of a number.
 */
public class QuestionTwentyNine {
    public static void main(String[] args) {
        Reverse r = new Reverse();
        r.readNumber();
        r.show();
    }
}
class Reverse {
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
        String rev = "";
        for (int i = strNum.length() - 1; i >= 0; i--) {
            rev += (new Character(strNum.charAt(i))).toString();
        }
        num = Integer.parseInt(rev);
        System.out.println("Reverse: " + num);
    }
}