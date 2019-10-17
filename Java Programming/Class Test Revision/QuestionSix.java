import java.util.Scanner; 

class QuestionSix {
    public static void main(String... args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                sum += i;
            }
        }
        return num == sum;
    }
}