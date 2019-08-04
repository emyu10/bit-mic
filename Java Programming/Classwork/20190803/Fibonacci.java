/**
 * Fibonacci series using recursion.
 */
class Fibonacci {
    static int a = -1, b = 1, c, i;
    public static void main(String[] args) {
        fi(10);
    }
    
    public static void fi(int n) {
        if (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fi(n - 1);
        }
    }
}