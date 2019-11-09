package db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * The frame that holds the data panel and the anvigation buttons.
 */
public class ViewDBFrame extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    private JButton previousButton;
    private JButton nextButton;
    private DataPanel dataPanel;
    private JScrollPane scrollPane;
    private JComboBox tableNames;
    private Connection conn;
    private Statement stat;
    private DatabaseMetaData meta;
    private ResultSet rs;
    private boolean scrolling;

    public ViewDBFrame() {
        setTitle("ViewDB");
        setSize(WIDTH, HEIGHT);

        Container contentPane = getContentPane();
        tableNames = new JComboBox();
        tableNames.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        });
    }
}
