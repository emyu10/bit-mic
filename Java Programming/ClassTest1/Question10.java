import java.util.*;

/**
 * Use class method to create a Java program to check whether a number is one
 * digit, two digit, three digit or four digit.
 */
class Question10 {
    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        cd.read();
        cd.countMethodOne();
        cd.countMethodTwo();
        cd.countMethodThree();
    }
}

class CountDigits {
    int num;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = s.nextInt();
    }

    public void countMethodOne() {
        if (num >= 0 && num < 10)
            System.out.println("One digit");

        else if (num >= 10 && num < 100)
            System.out.println("Two digit");

        else if (num >= 100 && num < 1000)
            System.out.println("Three digit");

        else if (num >= 1000 && num < 10000)
            System.out.println("Four digit");

        else
            System.out.println("Number too big to handle.");
    }

    public void countMethodTwo() {
        boolean oneDigit = num >= 0 && num < 10;
        boolean twoDigit = num >= 10 && num < 100;
        boolean threeDigit = num >= 100 && num < 1000;
        boolean fourDigit = num >= 1000 && num < 10000;
        if (oneDigit)
            System.out.println("One digit");
        else if (twoDigit)
            System.out.println("Two digit");
        else if (threeDigit)
            System.out.println("Three digit");
        else if (fourDigit)
            System.out.println("Four digit");
        else
            System.out.println("Number too big to handle.");
    }

    public void countMethodThree() {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count = count + 1;
        }

        System.out.println(count + " digits");
    }
}