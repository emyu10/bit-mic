package pos.saam;

import pos.saam.ui.ToolBarButton;
import pos.saam.user.LoginForm;
import pos.saam.user.User;
import pos.saam.user.UserModel;

import javax.swing.*;
import javax.xml.bind.DatatypeConverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Application extends JFrame implements ApplicationInterface {
    private BorderLayout layout;
    private Container contentPane;
    private JPanel contentArea;
    private User loggedIn;

    public static void main(String[] args) {
        (new Application()).setVisible(true);
    }

    public Application() {
        setTitle(pos.saam.Resources.appTitle());
        setSize(1000, 800);
        layout = new BorderLayout();
        setLayout(layout);
        setDefaultCloseOperation(Application.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        setToolBar();
        setupContentArea();
        init();
        test();
    }

    public void test() {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            String pass = "1234";
            md.update(pass.getBytes());
            byte[] hashPass = md.digest();

            System.out.println("hash of 1234: " + DatatypeConverter.printHexBinary(hashPass));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
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

            }
        };
        toolBar.add(userButton);
    }

    private void setupContentArea() {
        contentArea = new JPanel();
        contentArea.setLayout(new BoxLayout(contentArea, BoxLayout.Y_AXIS));
        contentPane.add(contentArea, BorderLayout.CENTER);
    }

    public void init() {
        if (!isAuthenticated()) {
            LoginForm form = new LoginForm(this);
            form.display();
        }
    }

    @Override
    public JPanel getContentArea() {
        if (contentArea == null) {
            setupContentArea();
        }
        return contentArea;
    }

    public boolean isAuthenticated() {
        return loggedIn != null;
    }

    @Override
    public boolean onLogin(User user) {
        if (user.getId() != -1) {
            loggedIn = user;
            return true;
        }
        return false;
    }
}
