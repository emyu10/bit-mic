package pos.saam;

import pos.saam.ui.ToolBarButton;
import pos.saam.user.User;
import pos.saam.user.UserModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Application extends JFrame implements ApplicationInterface {
    private Container contentPane;
    private User loggedIn;
    
    public static void main(String[] args) {
        (new Application()).setVisible(true);
    }

    public Application() {
        setTitle(pos.saam.Resources.appTitle());
        setSize(1000, 800);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(Application.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        setToolBar();
    }

    public void test() {
        UserModel m = new UserModel();
        ArrayList users = m.getUsers();
        System.out.println(((User)users.get(0)).getId());
        System.out.println(((User)users.get(0)).getUsername());
        System.out.println(((User)users.get(0)).getFullName());
        System.out.println(((User)users.get(0)).getPassword());
        System.out.println(((User)users.get(0)).isActive());
        System.out.println(((User)users.get(0)).getAddedOn());
    }

    private void setToolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setBackground(Color.DARK_GRAY);
        toolBar.setOpaque(false);
        contentPane.add(toolBar, BorderLayout.NORTH);
        ToolBarButton userButton = new ToolBarButton("Users", new ImageIcon("icons/user.png")) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("User manager button clicked");
            }
        };
        toolBar.add(userButton);
    }
}
