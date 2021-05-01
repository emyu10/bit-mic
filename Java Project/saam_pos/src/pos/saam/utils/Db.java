package pos.saam.utils;

import pos.saam.Resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Db {
    protected Connection conn;

    protected Connection getConnection() throws SQLException {
        String url = Resources.getProperties().getProperty("jdbc.url");
        String user = Resources.getProperties().getProperty("jdbc.username");
        String pass = Resources.getProperties().getProperty("jdbc.password");
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
