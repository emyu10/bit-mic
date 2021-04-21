import java.util.*;

/**
 * Read a number and find its factors.
 */
class Question02 {
    public static void main(String[] args) {
        Fact f = new Fact();
        f.read();
        f.findFactors();
    }
}

class Fact {
    int num;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to find factors for: ");

        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. The number retained as 0");
        }
    }

    public void findFactors() {
        System.out.print("\nFactors of " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}