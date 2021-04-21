package optionpane;

import javax.swing.*;

public class OptionPaneExample2 {
    JFrame f = new JFrame();

    OptionPaneExample2() {
        JOptionPane.showMessageDialog(f, "Successfully updated", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new OptionPaneExample2();
    }
}
