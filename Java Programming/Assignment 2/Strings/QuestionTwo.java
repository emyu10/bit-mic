/**
 * Read a name, convert to upper and lower.
 */
import java.util.Scanner;

class QuestionTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.println("'" + name + "' in uppercase: " + name.toUpperCase());
        System.out.println("'" + name + "' in lowercase: " + name.toLowerCase());
    }
}