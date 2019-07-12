import java.util.*;

class Sum {
	public static void main(String[] args) {
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = s.nextInt();
		System.out.print("Enter second number: ");
		b = s.nextInt();
		c = a + b;
		System.out.print("The sum is " + c);
	}
}