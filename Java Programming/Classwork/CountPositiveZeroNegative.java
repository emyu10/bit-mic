import java.util.Scanner;
class CountPositiveZeroNegative {
	public static void main(String[] args) {
		int[] a = new int[5];
		int z = 0, p = 0, n = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter a number: ");
			a[i] = s.nextInt();
		}

		
		for (int val: a) {
			if (val == 0) {
				z++;
			} else if (val > 0) {
				p++;
			} else {
				n++;
			}
		}
		
		System.out.println("Zero count = " + z);
		System.out.println("Positive count = " + p);
		System.out.println("Negative count = " + n);
	}
}