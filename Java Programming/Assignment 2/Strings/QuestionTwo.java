package Strings;

import java.util.Scanner;

/**
 * Read a name, convert to upper and lower.
 */
class QuestionTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.println("'" + name + "' in uppercase: " + name.toUpperCase());
        System.out.println("'" + name + "' in lowercase: " + name.toLowerCase());
        s.close();
    }
}