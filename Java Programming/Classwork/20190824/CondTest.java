import java.util.*;

class CondTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = s.nextInt();
        System.out.print("Enter number 2: ");
        int b = s.nextInt();

        s.close();

        int c = a > b ? a : b;

        System.out.println("Bigger value is : " + c);
    }
}