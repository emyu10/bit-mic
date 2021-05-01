package pos.saam.user;

import pos.saam.Application;
import pos.saam.ApplicationInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class LoginForm extends JPanel {
    private ApplicationInterface parent;
    private JLabel lblUsername = new JLabel("Username");
    private JLabel lblPassword = new JLabel("Password");
    private JTextField txtUsername = new JTextField(20);
    private JPasswordField txtPassword = new JPasswordField(20);
    private JButton btnLogin = new JButton("Login");
    private JButton btnReset = new JButton("Reset");
    private SpringLayout layout = new SpringLayout();

    public LoginForm(ApplicationInterface parent) {
        this.parent = parent;
        setLayout(layout);
        setupLayout();
        setUpBtnLogin();
    }

    private void setupLayout() {
        layout.putConstraint(SpringLayout.WEST, lblUsername, 200, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, lblUsername, 200, SpringLayout.NORTH, this);
        add(lblUsername);
        layout.putConstraint(SpringLayout.WEST, lblPassword, 200, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, lblPassword, 20, SpringLayout.SOUTH, txtUsername);
        add(lblPassword);
        layout.putConstraint(SpringLayout.WEST, txtUsername, 20, SpringLayout.EAST, lblUsername);
        layout.putConstraint(SpringLayout.NORTH, txtUsername, 200, SpringLayout.NORTH, this);
        txtUsername.setBounds(0,0,20,20);
        add(txtUsername);
        layout.putConstraint(SpringLayout.WEST, txtPassword, 0, SpringLayout.WEST, txtUsername);
        layout.putConstraint(SpringLayout.NORTH, txtPassword, 20, SpringLayout.SOUTH, txtUsername);
        add(txtPassword);
        layout.putConstraint(SpringLayout.WEST, btnLogin, 200, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.NORTH, btnLogin, 20, SpringLayout.SOUTH, txtPassword);
        add(btnLogin);
        layout.putConstraint(SpringLayout.EAST, btnReset, 0, SpringLayout.EAST, txtPassword);
        layout.putConstraint(SpringLayout.NORTH, btnReset, 20, SpringLayout.SOUTH, txtPassword);
        add(btnReset);

    }

    private void setUpBtnLogin() {
        this.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String username = txtUsername.getText();
                String password = String.valueOf(txtPassword.getPassword());
            }
        });
    }

    public void display() {
        parent.getContentArea().add(this);
    }
}
