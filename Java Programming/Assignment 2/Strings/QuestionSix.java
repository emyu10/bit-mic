package Strings;

import java.util.Scanner;

/**
 * Read a name, search a how many times character is present.
 */
class QuestionSix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();

        System.out.print("Enter character to search: ");
        char letter = s.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == letter) {
                count++;
            }
        }
         
        System.out.println("Character '" + letter + "' is present " + count + " times in '" + name + "'");
        s.close();
    }
}