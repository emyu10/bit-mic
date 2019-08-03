/*
 * Sum of 2 numbers to demonstrate try..catch
 */
import java.util.*;

class SumOfTwoNumbers1 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.print("Enter number 1: ");
            a = s.nextInt();
            
            System.out.print("Enter number 2: ");
            b = s.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        
        sum(a, b);
        try {
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
    
    public static void divide(int a, int b) throws ArithmeticException {
        float result = 0;
        
        result = a / b;
        System.out.println("Result is " + result);
    }
}
