/*
 * Enter values for 3 angles of a triangle and print the type of triangle.
 * THIS PROGRAM IS TOTALLY WRONG. THE SWITCH BLOCK DOES NOT WORK LIKE THAT IN JAVA.
 */
class Triangle {
	public static void main(String[] args) {
		int a, b, c, sum = 0;
		if (args.length < 3) {
			System.out.println("Enter 3 angles");
		} else {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
			sum = a + b + c;
			
			switch (true) {
				case (sum != 180):
					System.out.println("not a triangle");
					break;
				case a == 90 || b == 90 || c == 90:
					System.out.println("Right angled triangle");
					break;
				case a == 60 && b == 60 && c == 60:
					System.out.println("Equal triangle");
					break;
				case a == b || b == c || a == c: 
					System.out.println("Isosceles triangle");
					break;
				default:
					System.out.println("Normal triangle");
			}
		}
	}
}
