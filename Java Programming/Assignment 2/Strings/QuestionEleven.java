package Strings;

import java.util.Scanner;

/**
 * Read 2 names and merge it.
 */
class QuestionEleven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = s.nextLine();

        System.out.print("Enter another name: ");
        String name2 = s.nextLine();
 
        
        System.out.println("Full Name: " + name1.concat(" ").concat(name2));
        s.close();
    }
}