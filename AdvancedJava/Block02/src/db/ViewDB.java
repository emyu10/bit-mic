package db;

import javax.swing.*;

/**
 * This program uses metadata to display arbitrary tables in a database.
 */
public class ViewDB {
    public static void main(String[] args) {
        JFrame frame = new ViewDBFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
