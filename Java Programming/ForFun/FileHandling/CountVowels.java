import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class CountVowels {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("reading.txt");
            Scanner s = new Scanner(in); // not System.in
            String vowels = "aeiouAEIOU";
            int count = 0;

            while (s.hasNext()) {
                String str = s.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    if (vowels.indexOf(str.charAt(i)) >= 0) {
                        count++;
                    }
                }
            }

            System.out.println("Number of vowels: " + count);

            s.close();
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
