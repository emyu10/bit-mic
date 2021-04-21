import java.util.*;

/**
 * Read a Number. Check it is Palindrome or not.
 */
class Question03 {
    public static void main(String[] args) {
        int num, r;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scanner.nextInt();
        r = reverse(num);

        if (num == r)
            System.out.println(num + " is a Palindrome.");
        else
            System.out.println(num + " is not a Palindrome.");
    }

    private static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10;
            rev = rev + (num % 10) ;
            num = num / 10;
        }
        return rev;
    }
}