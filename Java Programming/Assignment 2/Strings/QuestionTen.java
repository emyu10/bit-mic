package Strings;

import java.util.Scanner;

/**
 * Read a name, find the index of a character.
 */
class QuestionTen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = s.nextLine();

        System.out.print("Enter a letter: ");
        char letter = s.next().charAt(0);

        System.out.println("Index of '" + letter + "' in '" + name + "' is " + name.indexOf(letter));
        s.close();
    }
}