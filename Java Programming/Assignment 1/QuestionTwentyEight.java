import java.util.Scanner;
public class QuestionTwentyEight {
    public static void main(String[] args) {
        Perfect p = new Perfect();
        p.readNumber();
        p.show();
    }
}
class Perfect {
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
    private int sumDivisors() {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public void show() {
        if (num > 0 && sumDivisors() == num) {
            System.out.println(num + " is a PERFECT number.");
        } else {
            System.out.println(num + " is NOT a PERFECT number.");
        }
    }
}