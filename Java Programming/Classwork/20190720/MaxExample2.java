/*
 * example of Math.max
 * Returns the maximum among 2 numbers.
 * This program finds the max of 4 numbers.
 */
import java.util.Scanner;
class MaxExample2 {
	public static void main(String[] args) {
		int a, b, c, d, e = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = s.nextInt();
		System.out.print("Enter b: ");
		b = s.nextInt();
		System.out.print("Enter c: ");
		c = s.nextInt();
		System.out.print("Enter d: ");
		d = s.nextInt();
		e = Math.max(a, e);
		e = Math.max(b, e);
		e = Math.max(c, e);
		e = Math.max(d, e);
		System.out.print("The max is " + e);
	}
}
