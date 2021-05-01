package pos.saam.user;

import pos.saam.utils.Db;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserModel extends Db {
    private ResultSet userResult;
    private ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        try {
            this.getConnection();
            String sql = "select * from user";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            userResult = stmt.executeQuery();
            while (userResult.next()) {
                users.add(new User(
                        userResult.getInt("id"),
                        userResult.getString("username"),
                        userResult.getString("fullname"),
                        userResult.getString("password"),
                        userResult.getInt("active") == 1,
                        userResult.getInt("admin") == 1,
                        userResult.getString("addedon")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.users;
    }

    public User getByCredentials(String username, String password) {
        User user = new User();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] hashPass = md.digest();
            this.getConnection();
            String sql = "select id, username, fullname, password, active, admin, addedon from user where username=? and password=?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, DatatypeConverter.printHexBinary(hashPass).toLowerCase());
            userResult = stmt.executeQuery();
            if (userResult.next()) {
                user = new User(
                        userResult.getInt("id"),
                        userResult.getString("username"),
                        userResult.getString("fullname"),
                        userResult.getString("password"),
                        userResult.getInt("active") == 1,
                        userResult.getInt("admin") == 1,
                        userResult.getString("addedon")
                );
            }
        } catch(NoSuchAlgorithmException | SQLException e) {
            return user;
        }
        return user;
    }
}