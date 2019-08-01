/**
 * Read a name, replace a character with another.
 */
import java.util.Scanner;

class QuestionThirteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = s.nextLine();

        System.out.print("Enter old character: ");
        char oldChar = s.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = s.next().charAt(0);


        System.out.println("Replaced '" + oldChar + "' with '" + newChar + "' from '" + name + "': " + name.replace(oldChar, newChar));
    }
}