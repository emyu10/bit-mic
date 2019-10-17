/**
 * Read a file & print it
 */
import java.util.Scanner;
import java.io.FileInputStream;
class ACB {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("abc.txt");
			int a;
			while ((a = in.read()) != -1) {
				System.out.print((char) a);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}