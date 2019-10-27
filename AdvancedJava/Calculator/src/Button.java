import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class Button extends JButton implements ActionListener {
    public Button(String text) {
        super(text);
    }

    abstract public void actionPerformed(ActionEvent actionEvent);
}
