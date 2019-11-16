import javax.swing.*;

public class ChatPane extends JPanel {
    private JTextField messageBox = new JTextField();
    private SpringLayout layout = new SpringLayout();

    /**
     * The constructor
     */
    ChatPane() {
        setLayout(layout);
        layout.putConstraint(SpringLayout.WEST, messageBox, 0, SpringLayout.WEST, this);
        layout.putConstraint(SpringLayout.EAST, messageBox, 0, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.SOUTH, messageBox, 0, SpringLayout.SOUTH, this);
        add(messageBox);
    }
}
