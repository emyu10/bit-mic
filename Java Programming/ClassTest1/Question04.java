import java.util.*;

/**
 * Use class method to create a Java program to find Biggest and Smallest among
 * 5 numbers (use 3 functions).
 */
class Question04 {
    public static void main(String[] args) {
        BigAndSmall bs = new BigAndSmall();
        bs.read();
        bs.findBiggest();
        bs.findSmallest();
    }
}

class BigAndSmall {
    int a, b, c, d, e, big, small;

    public void read() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = s.nextInt();

        System.out.print("Enter number 2: ");
        b = s.nextInt();

        System.out.print("Enter number 3: ");
        c = s.nextInt();

        System.out.print("Enter number 4: ");
        d = s.nextInt();

        System.out.print("Enter number 5: ");
        e = s.nextInt();
    }

    public void findBiggest() {
        big = a;
        if (b > big)
            big = b;
        if (c > big)
            big = c;
        if (d > big)
            big = d;
        if (e > big)
            big = e;
        System.out.println("Biggest number: " + big);
    }

    public void findSmallest() {
        small = a;
        if (b < small)
            small = b;
        if (c < small)
            small = c;
        if (d < small)
            small = d;
        if (e < small)
            small = e;
        System.out.println("Smallest number: " + small);
    }
}