import java.util.*;
class PosNeg {
	private int a;

	public void read() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number: ");
		a = s.nextInt();
	}
	
	public void print() {
		if (a == 0) {
			System.out.println("Its zero");
		} else if (a > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}
}

public class PN {
	public static void main(String[] args) {
		PosNeg num = new PosNeg();
		num.read();
		num.print();
	}
}