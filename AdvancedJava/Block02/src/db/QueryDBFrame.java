package db;

import com.sun.jdi.ClassNotPreparedException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;

public class QueryDBFrame extends JFrame {
    private JComboBox authors;
    private JLabel lblauthors;
    private JComboBox publishers;
    private JLabel lblpublishers;
    private JTextField priceChange;
    private JTextArea result;
    private static Connection conn;
    private Statement stat;
    private PreparedStatement authorQueryStmt;
    private PreparedStatement authorPublisherQueryStmt;
    private PreparedStatement publisherQueryStmt;
    private PreparedStatement allQueryStmt;

    public static Connection getConnection() throws SQLException, IOException {
        String url = "jdbc:mysql://localhost:3306/library";

        String user = "root";
        String password = "1234";

        conn = DriverManager.getConnection(url, user, password);

        if (conn != null) {
            System.out.println("Connected to the database...");
        }
        return conn;
    }

    public QueryDBFrame() {
        setTitle("QueryDB");
        setSize(500, 500);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        lblauthors = new JLabel("Authors");
        authors = new JComboBox();
        authors.setEditable(false);
        authors.addItem("Any");
        lblpublishers = new JLabel("Publishers");
        publishers = new JComboBox();
        publishers.setEditable(false);
        publishers.addItem("Any");

        result = new JTextArea(4, 50);
        result.setEditable(false);

        priceChange = new JTextField(8);
        priceChange.setText("-5.00");

        try {
            conn = getConnection();
            stat = conn.createStatement();

            String query = "select name from authors";
            ResultSet rs = stat.executeQuery(query);

            while (rs.next()) {
                authors.addItem(rs.getString(1));
            }

            rs.close();

            query = "select name from publishers";
            rs = stat.executeQuery(query);

            while (rs.next()) {
                publishers.addItem(rs.getString(1));
            }

            rs.close();
        } catch (SQLException e) {
            result.setText("");

            while (e != null) {
                result.append("" + e);
                e = e.getNextException();
            }
        } catch (IOException e) {
            result.setText("" + e);
        }

        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 100;
        gbc.weighty = 100;
        add(lblauthors, gbc, 0, 0, 1, 1);
        add(authors, gbc, 1, 0, 1, 1);
        add(lblpublishers, gbc, 0, 1, 1, 1);
        add(publishers, gbc, 1, 1, 1, 1);
        gbc.fill = GridBagConstraints.NONE;

        JButton queryButton = new JButton("Query");
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                executeQuery();
            }
        });

        add(queryButton, gbc, 0, 2, 1, 1);

        JButton changeButton = new JButton("Change prices");
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                changePrices();
            }
        });

        add(changeButton, gbc, 1, 2, 1, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;

        add(priceChange, gbc, 2, 2, 1, 1);

        gbc.fill = GridBagConstraints.BOTH;

        add(new JScrollPane(result), gbc, 0, 3, 4, 0);
    }

    private void add(Component c, GridBagConstraints gbc, int x, int y, int w, int h) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = w;
        gbc.gridheight = h;
        getContentPane().add(c, gbc);
    }

    private void executeQuery() {
        ResultSet rs = null;

        try {
            String author = (String) authors.getSelectedItem();
            String publisher = (String) publishers.getSelectedItem();

            if (!author.equals("Any") && !publisher.equals("Any")) {
                if (authorPublisherQueryStmt == null) {
                    String authorPublisherQuery = "select books.price, books.title from books, booksauthors, authors, publishers where authors.author_id = booksauthors.author_id and booksauthors.isbn = books.isbn and books.publisher_id = publishers.publisher_id and authors.name = ? and publishers.name = ?";
                    authorPublisherQueryStmt = conn.prepareStatement(authorPublisherQuery);
                }
                authorPublisherQueryStmt.setString(1, author);
                authorPublisherQueryStmt.setString(2, publisher);
                rs = authorPublisherQueryStmt.executeQuery();
            } else if (!author.equals("Any") && publisher.equals("Any")) {
                if (authorQueryStmt == null) {
                    String authorQuery = "select books.price, books.title from books, booksauthors, authors where authors.author_id = booksauthors.author_id and booksauthors.isbn = books.isbn and authors.name = ?";
                    authorQueryStmt = conn.prepareStatement(authorQuery);
                }
                authorQueryStmt.setString(1, author);
                rs = authorQueryStmt.executeQuery();
            } else if (author.equals("Any") && !publisher.equals("Any")) {
                if (publisherQueryStmt == null) {
                    String publisherQuery = "select books.price, books.title from books, publishers where books.publisher_id = publishers.publisher_id and publishers.name = ?";
                    publisherQueryStmt = conn.prepareStatement(publisherQuery);
                }
                publisherQueryStmt.setString(1, publisher);
                rs = publisherQueryStmt.executeQuery();
            } else {
                if (allQueryStmt == null) {
                    String allQuery = "select books.price, books.title from books";
                    allQueryStmt = conn.prepareStatement(allQuery);
                }
                rs = allQueryStmt.executeQuery();
            }
            result.setText("");
            while (rs.next()) {
                result.append(rs.getString(1));
                result.append(", ");
                result.append(rs.getString(2));
                result.append("\n");
            }
            rs.close();
        } catch (SQLException ex) {
            result.setText("");
            while (ex != null) {
                result.append("" + ex);
                ex = ex.getNextException();
            }
        }
    }

    public void changePrices() {
        String publisher = (String) publishers.getSelectedItem();
        if (publisher.equals("Any")) {
            result.setText("I am sorry, but I cannot do that.");
            return;
        }
        try {
            String updateStatement = "update books set price = price + " + priceChange.getText() + " where books.publisher_id = (select publisher_id from publishers where name = 'publisher')";
            int r = stat.executeUpdate(updateStatement);
            result.setText(r + " records updated");
        } catch (SQLException ex) {
            result.setText("");
            while (ex != null) {
                result.append("" + ex);
                ex = ex.getNextException();
            }
        }
    }
}
