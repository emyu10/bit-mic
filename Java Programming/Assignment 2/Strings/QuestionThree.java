package Strings;

import java.util.Scanner;

/**
 * Read a name, print characters in reverse.
 */
class QuestionThree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();
        s.close();
    }
}