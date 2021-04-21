import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Generator extends AbstractTableModel {
    private ArrayList<String> words = new ArrayList<>();
    private String letters;
    private String originalLetters;

    void generate(String letters) {
        this.letters = letters;
        this.originalLetters = letters;
        try {
            // to read the file which contains the word list
            FileInputStream in = new FileInputStream("words_dictionary");

            // to ease going through each word
            Scanner fileScanner = new Scanner(in);

            // while loop goes through all the words in the word list file
            while (fileScanner.hasNext()) {
                // gets the next word from the file
                String word = fileScanner.nextLine();

                // resets the letters to the original one, the user input
                letters = originalLetters;

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
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
    }

    @Override
    public int getRowCount() {
        return words.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getValueAt(int i, int i1) {
        return words.get(i);
    }

    public Generator newInstance() {
        return this;
    }
}
