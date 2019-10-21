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
    private JTextField display = new JTextField();
    private JPanel numberGrid = new JPanel();

    public Calculator() {
        super("Calculator");
        setLayout(null);
        numberGrid.setLayout(new GridLayout(4, 3));
        numberGrid.add(numOne);
        numberGrid.add(numTwo);
        numberGrid.add(numThree);
        numberGrid.add(numFour);
        numberGrid.add(numFive);
        numberGrid.add(numSix);
        numberGrid.add(numSeven);
        numberGrid.add(numEight);
        numberGrid.add(numNine);
        System.out.println(this.getWidth());
        display.setBounds(0, 0, 200, 30);
        numberGrid.setBounds(0, 31, 200, 159);
        add(display);
        add(numberGrid);
    }

    public void showWindow() {
        setSize(200, 200);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.showWindow();
    }
}
