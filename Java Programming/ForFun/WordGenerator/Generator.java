/**
 * This program scans a series of letters from the user
 * and generates a list of words that can be made from those letters.
 */

import java.io.*;
import java.util.*;

public class Generator {
    public static void main(String[] args) {
        try {
            // to read the file which contains the word list
            FileInputStream in = new FileInputStream("words_dictionary");

            // to ease going through each word
            Scanner fileScanner = new Scanner(in);

            // to get user input letters
            Scanner input = new Scanner(System.in);

            // scans the user input letters
            System.out.print("Enter letters: ");
            String originalLetters = input.nextLine();

            // to store all valid words to print later
            ArrayList<String> words = new ArrayList<String>();

            // while loop goes through all the words in the word list file
            while (fileScanner.hasNext()) {
                // gets the next word from the file
                String word = fileScanner.nextLine();

                // resets the letters to the original one, the user input
                String letters = originalLetters;

                // to track if the current word from the file is valid
                boolean valid = true;

                // for loop goes through each letter in the current word
                // and checks if the letter is present in user input letters.
                for (int i = 0; i < word.length(); i++) {
                    // checks if the letter at i position of the word is present in user input
                    // letters.
                    // if it's not, valid variable is set to false.
                    // break statement skips checking all the other letters in the word
                    // by breaking the for loop and moving to the next statement after the for loop
                    if (letters.indexOf(word.charAt(i)) == -1) {
                        valid = false;
                        break;
                    }

                    // when a letter is checked, the checked letter should be removed
                    // from the user input letters
                    letters = letters.replace(word.charAt(i), '#');
                }

                // if the current word in the file is valid
                // it's added to the word list
                if (valid) {
                    words.add(word);
                }
            }

            // printing the valid word list
            System.out.println("Generated words.\n----------------------");
            for (String w : words) {
                System.out.println(w);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
    }
}
