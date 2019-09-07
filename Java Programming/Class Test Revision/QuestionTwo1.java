import java.util.Scanner;

class QuestionTwo1 {
    public static void main(String... args) {
        int n, f = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        System.out.println("The factorial is " + f);
    }
}