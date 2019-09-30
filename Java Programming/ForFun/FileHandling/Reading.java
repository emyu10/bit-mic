import java.io.FileReader;
import java.io.IOException;

class Reading {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("reading.txt");
            int c;
            while ((c = f.read()) != -1) {
                System.out.println((char) c);
            }
            f.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}