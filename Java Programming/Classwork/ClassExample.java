import java.util.*;
class Abc {
	private int a, b, c;
	
	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		a = s.nextInt();
		System.out.print("Enter number 2: ");
		b = s.nextInt();
	}

	public void print() {
		c = a + b;
		System.out.println("The sum of a and b is " + c);
	}
}

public class ClassExample {
	public static void main(String[] args) {
		Abc x = new Abc();
		x.read();
		x.print();
	}
}