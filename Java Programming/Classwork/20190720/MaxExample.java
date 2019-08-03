/*
 * example of Math.max
 * Returns the maximum among 2 numbers.
 */
import java.util.Scanner;
class MaxExample {
	public static void main(String[] args) {
		int a, b;// c, d;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = s.nextInt();
		System.out.print("Enter b: ");
		b = s.nextInt();
		//System.out.print("Enter c: ");
		//c = s.nextInt();
		//System.out.print("Enter d: ");
		//d = s.nextInt();
		System.out.print("The max is " + Math.max(a,b));
	}
}
