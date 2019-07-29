/**
 * File and FileWriter example.
 */
import java.util.*;
import java.io.*;
class Writer {
	public static void main(String[] args) {
		try {
			File f = new File("abc.txt");
			FileWriter fw = new FileWriter(f);
			fw.write('A');
			fw.write('N');
			fw.write('O');
			fw.write('O');
			fw.write('P');
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}