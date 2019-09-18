import java.util.Scanner;

/**
 * Sum up to the number.
 */
public class QuestionTwentyTwo {
    public static void main(String[] args) {
        SumUpTo sut = new SumUpTo();
        sut.readNumber();
        sut.sumUp();
    }
}
class SumUpTo {
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
    public void sumUp() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}