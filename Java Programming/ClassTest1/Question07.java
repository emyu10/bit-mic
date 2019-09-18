import java.util.*;

/**
 * Read a number. Find factorial.
 */
class Question07 {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println(num + "! = " + fact);
    }
}