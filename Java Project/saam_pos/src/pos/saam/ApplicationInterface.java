package pos.saam;

import pos.saam.user.User;

import javax.swing.*;
import java.awt.*;

public interface ApplicationInterface {
    Container getContentPane();
    JPanel  getContentArea();
    boolean onLogin(User user);
}
