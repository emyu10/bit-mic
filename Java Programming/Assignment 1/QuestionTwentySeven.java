import java.util.Scanner;

/**
 * Check if an entered number is prime or not.
 */
public class QuestionTwentySeven {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.readNumber();
        p.isPrime();
    }
}
class Prime {
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
    public void isPrime() {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        prime = prime && num != 0 && num != 1;
        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}