package Strings;

import java.util.Scanner;

/**
 * Read a name, find length
 */
class QuestionOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = s.nextLine();
        System.out.println("Length of '" + name + "' is " + name.length());
    }
}