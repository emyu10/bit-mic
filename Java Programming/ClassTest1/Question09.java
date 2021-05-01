import java.util.*;

/**
 * Read a number. Check it is prime or not.
 * Warning: This program has a logical error.
 */
class Question09 {
    public static void main(String[] args) {
        int num;
        boolean prime = true;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(num + " is PRIME");
        else
            System.out.println(num + " is NOT PRIME");
    }
}