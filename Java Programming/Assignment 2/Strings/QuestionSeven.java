
/**
 * Read 2 names and check they are same or not.
 */
import java.util.Scanner;

class QuestionSeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = s.nextLine();

        System.out.print("Enter another name: ");
        String name2 = s.nextLine();
 
        if (name1.compareTo(name2) == 0) {
            System.out.println("Names are same.");
        } else {
            System.out.println("Names are not same.");
        }
    }
}