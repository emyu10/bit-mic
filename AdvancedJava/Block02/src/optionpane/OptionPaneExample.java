package optionpane;

import javax.swing.*;

public class OptionPaneExample {
    JFrame f = new JFrame();

    OptionPaneExample() {
        JOptionPane.showMessageDialog(f, "Hello, welcome to MI College");
    }

    public static void main(String[] args) {
        new OptionPaneExample();
    }
}
