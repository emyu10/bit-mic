import java.util.*;

public class Calendar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");

		String year = scanner.next();

		System.out.println();



		int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


		Date date;


		try {

			date = new Date("01/01/" + year);

			int startDay = date.getDay();



			if (Integer.parseInt(year) % 4 == 0) {

				daysInMonths[1] = 29;
			}



			for (int mloop = 0; mloop < months.length; mloop++) {

				System.out.println(months[mloop] + "\n------------");
				System.out.println("S\tM\tT\tW\tT\tF\tS");
				int i, day = 1;
				for (i = startDay; day <= daysInMonths[mloop]; i++) {
					if (day == 1) {
						for (int j = 0; j < startDay; j++) {
							System.out.print("\t");
						}

					}


					System.out.print(day + "\t");
					if ((i % 7) == 6) {
						System.out.println();
					}
					day++;
				}
				startDay = i % 7;
				System.out.println("\n\n");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid year was supplied.");
		}
	}
}
