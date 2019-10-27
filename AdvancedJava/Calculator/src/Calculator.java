import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private NumberButton numOne = new NumberButton(this,"1");
    private NumberButton numTwo = new NumberButton(this,"2");
    private NumberButton numThree = new NumberButton(this,"3");
    private NumberButton numFour = new NumberButton(this,"4");
    private NumberButton numFive = new NumberButton(this,"5");
    private NumberButton numSix = new NumberButton(this,"6");
    private NumberButton numSeven = new NumberButton(this,"7");
    private NumberButton numEight = new NumberButton(this,"8");
    private NumberButton numNine = new NumberButton(this, "9");
    private NumberButton numZero = new NumberButton(this,"0");

    private OperatorButton opDivide = new OperatorButton(this, "÷");
    private OperatorButton opTimes = new OperatorButton(this, "×");
    private OperatorButton opMinus = new OperatorButton(this, "−");
    private OperatorButton opPlus = new OperatorButton(this, "+");
    private OperatorButton opDot = new OperatorButton(this, ".");
    private OperatorButton opEqual = new OperatorButton(this, "=");

    private JTextField display = new JTextField("0");

    private Calculator() {
        super("Calculator");
        init();
    }

    private void showWindow() {
        setSize(300, 235);
        setResizable(false);
        setVisible(true);
    }

    JTextField getDisplay() {
        return display;
    }

    private void init() {
        setLayout(new GridLayout(5, 1));
        setBackground(Color.DARK_GRAY);

        // adding number buttons to the grid 111611

        display.setBackground(new Color(206, 220, 185));
        display.setForeground(new Color(77, 115, 138));
        display.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5));
        display.setFont(new Font("Operator Mono", Font.BOLD, 20));
        add(display);

        JPanel rowOne = new JPanel(new GridLayout(1, 4));
        rowOne.add(numSeven);
        rowOne.add(numEight);
        rowOne.add(numNine);
        rowOne.add(opDivide);
        add(rowOne);

        JPanel rowTwo = new JPanel(new GridLayout(1, 4));
        rowTwo.add(numFour);
        rowTwo.add(numFive);
        rowTwo.add(numSix);
        rowTwo.add(opTimes);
        add(rowTwo);

        JPanel rowThree = new JPanel(new GridLayout(1, 4));
        rowThree.add(numOne);
        rowThree.add(numTwo);
        rowThree.add(numThree);
        rowThree.add(opMinus);
        add(rowThree);

        JPanel rowFour = new JPanel(new GridLayout(1, 4));
        rowFour.add(numZero);
        rowFour.add(opDot);
        rowFour.add(opEqual);
        rowFour.add(opPlus);
        add(rowFour);

//        display.setBounds(0, 0, 300, 30);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.showWindow();
    }


}
