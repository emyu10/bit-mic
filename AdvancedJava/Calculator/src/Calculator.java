import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JButton numOne = new JButton("1");
    private JButton numTwo = new JButton("2");
    private JButton numThree = new JButton("3");
    private JButton numFour = new JButton("4");
    private JButton numFive = new JButton("5");
    private JButton numSix = new JButton("6");
    private JButton numSeven = new JButton("7");
    private JButton numEight = new JButton("8");
    private JButton numNine = new JButton("9");
    private JButton numZero = new JButton("0");

    public Calculator() {
        super("Calculator");
        setLayout(new GridLayout(3, 3));
        add(numOne);
        add(numTwo);
        add(numThree);
        add(numFour);
        add(numFive);
        add(numSix);
        add(numSeven);
        add(numEight);
        add(numNine);
    }

    public void showWindow() {
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.showWindow();
    }
}
