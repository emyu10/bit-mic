import java.io.FileInputStream;

public class QuestionTwo {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("q2.txt");
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = fin.read()) != -1) {
                sb.append((char) ch);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println("Could not open file for reading.");
        }
    }
}
