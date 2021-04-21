import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract public class Button extends JButton implements ActionListener {
    public Button(String text) {
        super(text);
        setFont(new Font("sans-serif", Font.BOLD, 40));
    }

    abstract public void actionPerformed(ActionEvent actionEvent);
}
