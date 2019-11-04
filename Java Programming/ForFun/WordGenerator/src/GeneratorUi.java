import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

/**
 * This program scans a series of letters from the user
 * and generates a list of words that can be made from those letters.
 * @author Mohamed Usman
 * @version 1.0
 * @since 2019-09-17
 * @docRoot
 */
public class GeneratorUi extends JFrame {
    private JTextField txtLetters = new JTextField();
    private JTable words = new JTable();

    GeneratorUi() {
        super("Word Generator");
        setLayout(null);
    }

    void initLayout() {
        txtLetters.setBounds(1, 1, 398, 50);
        words.setBounds(1, 51, 398, 549);
        words.setPreferredScrollableViewportSize(new Dimension());

        txtLetters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Generator gen = new Generator();
                gen.generate(txtLetters.getText());
//                gen.fireTableDataChanged();
                words.setModel(gen);
            }
        });
        add(txtLetters);
        add(words);
    }
    void showWindow() {
        setSize(400, 600);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        GeneratorUi gen = new GeneratorUi();
        gen.initLayout();
        gen.showWindow();
    }
}
