import java.io.*;
class MyFile {
	public static void main(String[] args) {
		File f = new File("abcde.txt");
		if (f.exists()) {
			System.out.println("File name: " + f.getName());
			System.out.println("Full Path: " + f.getAbsolutePath());
			System.out.println("Writable: " + f.canWrite());
			System.out.println("Readable: " + f.canRead());
			System.out.println("File size: " + f.length());
		}
	}
}