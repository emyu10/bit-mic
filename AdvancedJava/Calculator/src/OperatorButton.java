import java.awt.*;
import java.awt.event.ActionEvent;

public class OperatorButton extends Button {
    private Calculator parent;
    OperatorButton(Calculator parent, String text) {
        super(text);
        this.parent = parent;
        addActionListener(this);
        setBackground(new Color(77, 115, 138));
        //setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        setBorderPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String pressed = actionEvent.getActionCommand();
        boolean isCalcOperator = pressed.equals(Calculator.Operator.OP_PLUS) ||  pressed.equals(Calculator.Operator.OP_MINUS) || pressed.equals(Calculator.Operator.OP_TIMES) || pressed.equals(Calculator.Operator.OP_DIVIDE);
        if (isCalcOperator) {
            parent.setOperandOne(parent.getDisplay().getText());
            parent.setOperator(pressed);
        }
        if (pressed.equals(".")) {
            if (parent.getDisplay().getText().indexOf('.') == -1) {
                parent.getDisplay().setText(parent.getDisplay().getText() + ".");
            }
        }
    }
}
