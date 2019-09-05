import java.util.Scanner;

/**
 * Check if a number is palindrome or not.
 */
public class QuestionTwentyFive {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.readNumber();
        p.isPalindrome();
    }
}
class Palindrome {
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
    public void isPalindrome() {
        int numRev = reverse();
        if (num == numRev) {
            System.out.println("Number is palindrome.");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
    private int reverse() {
        String strNum = (new Integer(num)).toString();
        String strNumRev = "";
        for (int i = strNum.length() - 1; i >= 0; i--) {
            strNumRev += (new Character(strNum.charAt(i))).toString();
        }
        return Integer.parseInt(strNumRev);
    }
}