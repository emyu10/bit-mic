import java.util.*;

class EnumArithmetic {
    enum Ops {Plus, Minus, Multiplication, Division}
    public static void main(String[] args) {
        String op;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter operator: ");
        op = s.nextLine();
        cal(Ops.valueOf(op));
    }

    public static void cal(Ops op) {
        Scanner s = new Scanner(System.in);
        float a, b, result = 0;

        System.out.print("Enter number 1: ");
        a = s.nextFloat();

        System.out.print("Enter number 2: ");
        b = s.nextFloat();

        switch (op) {
            case Plus:
                result = a + b;
                break;
            case Minus:
                result = a - b;
                break;
            case Multiplication:
                result = a * b;
                break;
            case Division:
                result = a / b;
                break;
        }
        System.out.println("The result is " + result);
    }
}