package Strings;

import java.util.Scanner;

/**
 * Read 3 names and check they are same or not regardless of the case.
 */
class QuestionNine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = s.nextLine();

        System.out.print("Enter another name: ");
        String name2 = s.nextLine();

        System.out.print("Enter a third name: ");
        String name3 = s.nextLine();
 
        if (name1.compareToIgnoreCase(name2) == 0 && name1.compareToIgnoreCase(name3) == 0) {
            System.out.println("Names are same.");
        } else {
            System.out.println("Names are not same.");
        }
        s.close();
    }
}