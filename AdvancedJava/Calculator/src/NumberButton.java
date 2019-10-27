import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NumberButton extends Button {
    private Calculator parent;

    public NumberButton(Calculator parent, String text) {
        super(text);
        this.parent = parent;
        addActionListener(this);
        setBackground(new Color(120, 151, 171));
        //setBackground(new Color(77, 115, 138));
        setForeground(Color.WHITE);
        setBorderPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JTextField display = parent.getDisplay();
        String currentText = display.getText();
        if (currentText.equals("0") || parent.isOperatorPressed()) {
            display.setText(this.getText());
        } else {
            display.setText(currentText + this.getText());
        }
        parent.setOperatorPressed(false);
    }
}
