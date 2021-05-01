package gridlayout;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout {
    JFrame f;
    MyGridLayout() {
        f = new JFrame();

        JButton[] buttons = new JButton[9];

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            f.add(buttons[i]);
        }

        f.setLayout(new GridLayout(3, 3));
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
