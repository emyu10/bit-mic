package swingexample;

import javax.swing.*;

public class IconButtonExample {
    public IconButtonExample() {
        JFrame f = new JFrame("Icon Button Example");
        JButton b = new JButton(new ImageIcon("images/JD-01_2246806.png"));
        b.setBounds(100, 100, 100, 40);
        f.add(b);
        f.setSize(300, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IconButtonExample();
    }
}
