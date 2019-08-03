/*
 * Math.ceil() example. This method returns the value rounded
 * up to the nearest integer.
 */
import java.util.*;
class Ceiling {
	public static void main(String[] args) {
		double a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		a = s.nextDouble();
		System.out.println("Ceiling is " + Math.ceil(a));
	}
}