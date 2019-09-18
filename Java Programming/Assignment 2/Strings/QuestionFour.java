package Strings;

import java.util.Scanner;

/**
 * Read a name, count vowels in it.
 */
class QuestionFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = s.nextLine();
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < name.length(); i++) {
            if (vowels.indexOf(name.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels in '" + name + "' is: " + count);
    }
}