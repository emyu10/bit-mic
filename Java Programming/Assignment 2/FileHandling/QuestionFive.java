import java.io.*;

public class QuestionFive {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("q5.txt");
            String vowels = "AEIOUaeiou";
            int ch, count = 0;
            while ((ch = in.read()) != -1) {
                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }
            System.out.println("Count of vowels in file: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file.");
        } catch (IOException e) {
            System.out.println("Could not get the contents of the file.");
        }
    }
}