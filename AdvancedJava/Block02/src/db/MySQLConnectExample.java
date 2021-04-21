package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnectExample {
    public static void main(String[] args) {
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;

        try {
            String url1 = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String password = "1234";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connection to the database test2");
            }

            String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=1234";
            conn2 = DriverManager.getConnection(url2);

            if (conn2 != null) {
                System.out.println("Connected to the database test2");
            }

            String url3 = "jdbc:mysql://localhost:3306/test3";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "1234");

            conn3 = DriverManager.getConnection(url3, info);

            if (conn3 != null) {
                System.out.println("Connected to the database test3");
            }
        } catch (SQLException e) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            System.out.println("Exception: " + e);
        }
    }
}
