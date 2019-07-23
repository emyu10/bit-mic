/**
 * Check if a character is present in a file or not.
 */
import java.io.*;
class Three {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("abc.txt");
			char ch = 'g';
			boolean f = false;
			int a;
			while ((a = in.read()) != -1) {
				if ((char) a == ch) {
					f = true;
					break;
				}
			}
			
			if (f) {
				System.out.println("Character " + ch + " found in file.");
			} else {
				System.out.println("Character " + ch + " NOT found in file.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}