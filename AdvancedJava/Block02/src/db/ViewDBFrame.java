package db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

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
                showTable((String) tableNames.getSelectedItem());
            }
        });

        contentPane.add(tableNames, BorderLayout.NORTH);

        try {
            conn = getConnection();
            meta = conn.getMetaData();
            createStatement();
            getTableNames();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        if (scrolling) {
            previousButton = new JButton("Previous");
            previousButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    showPreviousRow();
                }
            });
            buttonPanel.add(previousButton);
        }

        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showNextRow();
            }
        });

        buttonPanel.add(nextButton);

//        add(new WindowAdapter(){
//            public void windowClosing(WindowEvent event) {
//                try {
//                    stat.close();
//                    conn.close();
//                } catch (SQLException ex) {
//                    while (ex != null) {
//                        ex.printStackTrace();
//                        ex.getNextException();
//                    }
//                }
//            }
//        });
    }

    public void createStatement() throws SQLException {
        if (meta.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
            stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            scrolling = true;
        } else {
            stat = conn.createStatement();
            scrolling = false;
        }
    }

    public void getTableNames() throws SQLException {
        ResultSet mrs = meta.getTables(null, null, null, new String[] {"TABLE"});
        while (mrs.next()) {
            tableNames.addItem(mrs.getString(3));
        }
        mrs.close();
    }

    public void showTable(String tableName) {
        try {
            if (rs != null) rs.close();
            rs = stat.executeQuery("select * from " + tableName);
            if (scrollPane != null) {
                getContentPane().remove(scrollPane);
            }
            dataPanel = new DataPanel(rs);
            scrollPane = new JScrollPane(dataPanel);
            getContentPane().add(scrollPane, BorderLayout.CENTER);
            validate();
            showNextRow();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    public void showPreviousRow() {
        try {
            if (rs == null || rs.isFirst()) return;
            rs.previous();
            dataPanel.showRow(rs);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    public void showNextRow() {
        try {
            if (rs == null || scrolling && rs.isLast()) return;
            if (!rs.next() && !scrolling) {
                rs.close();
                rs = null;
                return;
            }
            dataPanel.showRow(rs);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("database.properties");
        props.load(in);
        in.close();

        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc2.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }
}
