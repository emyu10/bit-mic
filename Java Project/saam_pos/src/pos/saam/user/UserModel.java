package pos.saam.user;

import pos.saam.utils.Db;

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
}