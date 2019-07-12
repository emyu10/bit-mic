import java.util.*;
class Biggest {
	private int a, b, c, d, biggest = 0;
	
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
	}

	public void print() {
		if (a > biggest) { biggest = a; }
		if (b > biggest) { biggest = b; }
		if (c > biggest) { biggest = c; }
		if (d > biggest) { biggest = d; }
		System.out.println("The biggest number is " + biggest);
	}
}

public class BiggestNumber {
	public static void main(String[] args) {
		Biggest b = new Biggest();
		b.read();
		b.print();
	}
}