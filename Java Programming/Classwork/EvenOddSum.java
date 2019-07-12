import java.util.Scanner;
class EvenOddSum {
	public static void main(String[] args) {
		int odd = 0, even = 0, a[] = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			a[i] = s.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (a[i]%2 == 0) {
				even += a[i];
			} else {
				odd += a[i];
			}
		}
		System.out.println("Even sum = " + even);
		System.out.println("Odd sum = " + odd);
	}
}