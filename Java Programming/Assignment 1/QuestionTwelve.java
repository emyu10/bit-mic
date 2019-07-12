import java.util.Scanner;

public class QuestionTwelve {
    public static void main(String[] args) {
        DivByTwoThree dbtt = new DivByTwoThree();
        dbtt.readNumber();
        dbtt.show();
    }
}

class DivByTwoThree {
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
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Number " + num + " is divisible by both 2 and 3.");
        } else {
            if (num % 2 == 0) {
                System.out.println("Number " + num + " is divisible by only 2.");
            } else if (num % 3 == 0) {
                System.out.println("Number " + num + " is divisible by only 3.");
            } else {
                System.out.println("Number " + num + " is NOT divisible by either 2 or 3.");
            }
        }
    }
}
