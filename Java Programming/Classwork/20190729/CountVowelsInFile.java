/**
 * Reads a file using FileReader class and counts the vowels in the file.
 */
import java.io.*;
class CountVowelsInFile {
	public static void main(String[] args) {
		File f = new File("abc.txt");
		try {
			FileReader fr = new FileReader(f);
			int a;
			int count = 0;
			String vowels = "aeiouAEIOU";
			while ((a = fr.read()) != -1) {
				if (vowels.indexOf((char) a) != -1) {
					count++;
				}
			}
			System.out.println("Number of vowels: " + count);
		} catch (IOException e) {
		}
	}
}