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

    private OperatorButton opDivide = new OperatorButton(this, Operator.OP_DIVIDE);
    private OperatorButton opTimes = new OperatorButton(this, Operator.OP_TIMES);
    private OperatorButton opMinus = new OperatorButton(this, Operator.OP_MINUS);
    private OperatorButton opPlus = new OperatorButton(this, Operator.OP_PLUS);
    private OperatorButton opDot = new OperatorButton(this, Operator.OP_DOT);
    private OperatorButton opEqual = new OperatorButton(this, Operator.OP_EQUALS);

    private JTextField display = new JTextField("0");

    private String opOne = null;
    private String opTwo = null;
    private String operator = null;

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

    public boolean isOperandOneSet() {
        return opOne != null;
    }

    void setOperandOne(String operandOne) {
        this.opOne = operandOne;
    }

    void setOperandTwo(String operandTwo) {
        this.opTwo = operandTwo;
    }

    void setOperator(String operator) {
        this.operator = operator;
    }

    void calculate() {
        double o1 = Double.parseDouble(opOne);
        double o2 = Double.parseDouble(opTwo);
        double result;
        switch (operator) {
            case Operator.OP_PLUS:
                result = o1 + o2;
                break;
            case Operator.OP_MINUS:
                result = o1 - o2;
                break;
            case Operator.OP_TIMES:
                result = o1 * o2;
                break;
            case Operator.OP_DIVIDE:
                result = o1 / o2;
                break;
            default:
                result = 0;
        }
        display.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.showWindow();
    }

    public final class Operator {
        final static String OP_PLUS = "+";
        final static String OP_MINUS = "−";
        final static String OP_TIMES = "×";
        final static String OP_DIVIDE = "÷";
        final static String OP_DOT = ".";
        final static String OP_EQUALS = "=";
    }
}
