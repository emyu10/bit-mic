import java.util.Scanner;

/**
 * Factors of a number.
 */
public class QuestionTwentyThree {
    public static void main(String[] args) {
        Factors f = new Factors();
        f.readNumber();
        f.getFactors();
    }
}
class Factors {
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
    public void getFactors() {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i);
                if (i != num) System.out.print(", ");
            }
        }
    }
}