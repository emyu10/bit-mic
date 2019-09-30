import java.io.FileWriter;
import java.io.IOException;

class Writing {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("writing.txt");
            String[] str = { "this ", " is ", " some ", " strings" };
            for (int i = 0; i < str.length; i++) {
                writer.write(str[i], 0, str[i].length());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}