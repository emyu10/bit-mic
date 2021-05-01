import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class ReadingScanner {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("reading.txt");
            Scanner s = new Scanner(in); // not System.in

            while (s.hasNext()) {
                String str = s.nextLine();
                System.out.println(str);
            }
            
            s.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}