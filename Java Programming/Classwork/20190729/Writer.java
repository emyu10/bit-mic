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
		stringWrite();
	}
	
	public static void stringWrite() {
		try {
			File f = new File("abcd.txt");
			Scanner s = new Scanner(System.in);
			String name;
			FileWriter fw = new FileWriter(f);
			System.out.print("Enter name: ");
			name = s.nextLine();
			fw.write(name, 0, name.length());
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}