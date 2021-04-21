import java.util.Scanner;

class QuestionOne {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        int num;

        System.out.print("Enter number: ");
        num = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}