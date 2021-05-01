/**
 * Factorial and sum up to the number using recursion.
 */
class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial is " + fact(num));
        System.out.println("Sum is " + sum(num));
    }

    /**
     * Factorial of a number.
     * @param a number to find the factorial of
     * @return int
     */
    static int fact(int a) {
        if (a == 1) return 1;
        else return a * fact(a - 1);
    }

    /**
     * Sum up to the number using recursion.
     * @param a number to find the sum of
     * @return int the sum
     */
    static int sum(int a) {
        if (a == 1) return 1;
        else return a + sum(a - 1);
    }
}