package Strings;

import java.util.Scanner;

/**
 * Read a name, search a character is present or not.
 */
class QuestionFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();

        System.out.print("Enter character to search: ");
        char letter = s.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == letter) {
                found = true;
                break;
            }
        }
        if (found) 
            System.out.println("Character '" + letter + "' is present in '" + name + "'");
        else
            System.out.println("Character '" + letter + "' is NOT present in '" + name + "'");
    }
}