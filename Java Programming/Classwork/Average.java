import java.util.*;
class Average {
	public static void main(String[] args) {
		int num = 0;
		double average;
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 4; i++) {
			System.out.print("Enter number " + i + ": ");
			num += s.nextInt();
		}
		average = num / 4;
		System.out.print("Average is " + average);
	}
}