/*
 * Find the square root of a number.
 */
import java.util.*;
class SquareRoot{
	public static void main(String[] args) {
		double a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		a = s.nextDouble();
		System.out.println("Absolute value is " + Math.sqrt(a));
	}
}