import java.util.Scanner;
public class QuestionEight {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            Armstrong a = new Armstrong();
            a.readNumber(i);
            a.result();
        }
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

    public void readNumber(int num) {
        this.num = num;
    }
    private int sums() {
        String strNum = (new Integer(num)).toString();
        int times = strNum.length();
        int sum = 0;
        for (int i = 0; i < times; i++) {
            int digit = Integer.parseInt((new Character(strNum.charAt(i))).toString());
            sum += Math.pow(digit, times);
        }
        return sum;
    }
    public void result() {
        int sumDigits = sums();
        if (sumDigits == num) {
            System.out.println(num + " ");
        }
    }
}