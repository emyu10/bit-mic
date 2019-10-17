import java.io.*;
import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            FileInputStream in = new FileInputStream("q3.txt");
            System.out.print("Enter new file name: ");
            String fileName = s.nextLine();
            FileOutputStream out = new FileOutputStream(fileName);
            int ch;
            while ((ch = in.read()) != -1) {
                out.write(ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file for reading or writing");
        } catch (IOException e) {
            System.out.println("Could not get the contents of the file.");
        }
    }
}
