
/**
 * Read 3 names merge it.
 */
import java.util.Scanner;

class QuestionTwelve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = s.nextLine();

        System.out.print("Enter another name: ");
        String name2 = s.nextLine();

        System.out.print("Enter a third name: ");
        String name3 = s.nextLine();
        
        System.out.println("Full Name: " + name1.concat(" ").concat(name2).concat(" ").concat(name3));
    }
}