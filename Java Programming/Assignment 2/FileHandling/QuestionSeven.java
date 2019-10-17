import java.io.*;

public class QuestionSeven {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("q7.txt");
            int length = 0;
            while (in.read() != -1) {
                length++;
            }
            System.out.println("The length of the file is: " + length);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file.");
        } catch (IOException e) {
            System.out.println("Could not get the contents of the file.");
        }
    }
}