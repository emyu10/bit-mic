/**
 * Read a text & write it into the file "abc.txt"
 */
import java.io.*;
import java.util.*;
class ABC {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("abc.txt");
			String a;
			int i, l;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter text: ");
			a = scanner.nextLine();
			l = a.length();
			
			for (i = 0; i < l; i++) {
				out.write(a.charAt(i));
			}
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}