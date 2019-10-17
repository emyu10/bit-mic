import java.io.*;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter(new File("q4.txt"));
            System.out.print("Enter a text: ");
            String contents = s.nextLine();
            fw.write(contents);
            fw.close();
        } catch (IOException e) {
            System.out.println("Could not open file.");
        }
    }
}
