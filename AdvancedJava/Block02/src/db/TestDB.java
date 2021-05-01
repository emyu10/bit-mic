package db;

import javax.xml.transform.Result;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class TestDB {
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            Statement stat = conn.createStatement();

            stat.execute("CREATE TABLE greetings (name char(20))");
            stat.execute("insert into greetings values ('Hello world')");

            ResultSet result = stat.executeQuery("Select * from greetings");
            result.next();
            System.out.println(result.getString(1));
            result.close();

            stat.execute("drop table greetings");

            stat.close();
            conn.close();
        } catch (SQLException e) {
            while (e != null) {
                e.printStackTrace();
                e = e.getNextException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("database.properties");
        props.load(in);
        in.close();

        String drivers = props.getProperty("jdbc.drivers");

        if (drivers != null) {
            System.setProperty("jdbc.drivers", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }
}
