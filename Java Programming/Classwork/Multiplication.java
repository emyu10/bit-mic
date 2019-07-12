/*
 * Display the multiplication table of a number entered as a command line argument.
 */
class Multiplication {
	public static void main(String[] args) {
		int a, b;
		try {
			a = Integer.parseInt(args[0]);
			for (b = 1; b < 10; b++) {
				System.out.println(b + " x " + a + " = " + (a * b));
			}
		} catch (Exception e) {
			System.out.println("Enter a value");
		}
		
	}
}
