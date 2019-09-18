/**
 * Generate Fibonacci series. 0 1 1 2 3 5 8 13 21 (first 15)
 */
class Question08 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 0; i < 15; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}