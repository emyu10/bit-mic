import java.util.Scanner;
class CountEvenOdd {
	public static void main(String[] args) {
		int[] a = new int[5];
		int e = 0, o = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a number: ");
			a[i] = s.nextInt();
		}

		
		for (int val: a) {
			if (val%2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		
		System.out.println("Even count = " + e);
		System.out.println("Odd count = " + o);
	}
}