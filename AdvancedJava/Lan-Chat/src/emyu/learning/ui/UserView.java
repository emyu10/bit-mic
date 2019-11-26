package emyu.learning.ui;

import javax.swing.*;
import java.awt.*;

public class UserView extends JButton {
    public UserView(String name, String ip) {
        JLabel lblName = new JLabel(name);
        JLabel lblIp = new JLabel(ip);
        lblName.setFont(new Font("sans-serif", Font.BOLD, 16));
        lblIp.setForeground(Color.GRAY);

        lblIp.setHorizontalAlignment(JLabel.RIGHT);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.DARK_GRAY), BorderFactory.createEmptyBorder(10,10,10,10)));

        add(lblName);
        add(lblIp);

        setBackground(Color.WHITE);
        setLayout(new GridLayout(1, 2));
    }
}
