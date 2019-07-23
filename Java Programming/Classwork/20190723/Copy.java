/**
 * Read from a file and write the content to another file.
 */
import java.io.*;
class Copy {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please specify the file to copy and the new file name");
		} else {
			if (args[0] != null && args[1] == null) {
				System.out.println("Please specify the name of the new file.");
			} else {
				try {
					FileInputStream in = new FileInputStream(args[0]);
					FileOutputStream out = new FileOutputStream(args[1]);
					int a;
					while ((a = in.read()) != -1) {
						out.write(a);
					}
					in.close();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}