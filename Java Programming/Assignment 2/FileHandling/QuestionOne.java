import java.io.FileOutputStream;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            FileOutputStream fout = new FileOutputStream("q1.txt");
            System.out.print("Enter a text: ");
            String content = s.nextLine();
            fout.write(content.getBytes(), 0, content.length());
        } catch (Exception e) {
            System.out.println("Could not open file for writing");
        }
    }
}
