/*
 * To show command line arguments at work.
 * To run type 'CmdArgs 1 2 3' on the console.
 */
class CmdArgs {
	public static void main(String[] args) {
		int a, b, c, d;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		d = a + b + c;
		System.out.println("The sum of arguments is " + d);
	}
}
