/*
 * Find the power of a number.
 */
import java.util.*;
class PowerExample {
	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		a = s.nextInt();
		System.out.print("Enter power: ");
		b = s.nextInt();
		System.out.println(a + " to the power " + b + " is " + Math.pow(a, b));
	}
}