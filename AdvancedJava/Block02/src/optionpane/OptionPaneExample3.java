package optionpane;

import javax.swing.*;

public class OptionPaneExample3 {
    JFrame f = new JFrame();

    OptionPaneExample3() {
        String name = JOptionPane.showInputDialog(f, "Enter name");
    }

    public static void main(String[] args) {
        new OptionPaneExample3();
    }
}
