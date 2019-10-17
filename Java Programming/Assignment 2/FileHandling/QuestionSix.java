import java.io.*;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("q6.txt");
            int ch;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the character to search for: ");
            char letter = s.next().charAt(0);
            boolean found = false;
            while ((ch = in.read()) != -1) {
                if ((char) ch == letter) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Character '" + letter + "' found in file");
            } else {
                System.out.println("Character '" + letter + "' NOT found in file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file.");
        } catch (IOException e) {
            System.out.println("Could not get the contents of the file.");
        }
    }
}