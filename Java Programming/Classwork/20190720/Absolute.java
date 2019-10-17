/*
 * Find the absolute value of a number.
 */
import java.util.*;
class Absolute {
	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		a = s.nextInt();
		b = Math.abs(a);
		System.out.println("Absolute value is " + b);
	}
}