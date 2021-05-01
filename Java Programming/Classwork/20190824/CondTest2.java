import java.util.*;

class CondTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = s.nextInt();
        System.out.print("Enter number 2: ");
        int b = s.nextInt();
        System.out.print("Enter number 3: ");
        int c = s.nextInt();

        s.close();

        int d = a < b && a < c ? a : b < c ? b : c;

        System.out.println("Smaller value is : " + d);
    }
}