import java.awt.*;
import java.awt.event.ActionEvent;

public class OperatorButton extends Button {
    private Calculator parent;
    OperatorButton(Calculator parent, String text) {
        super(text);
        this.parent = parent;
        setBackground(new Color(77, 115, 138));
        //setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        setBorderPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
