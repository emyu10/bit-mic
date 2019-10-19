package calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.setSize(500, 500);
		myCal.setVisible(true);
	}
	
	public Calculator() {
		super("My Calculator");
		setLayout(new BorderLayout());
		setControls();
	}
	private void setControls() {
		JTextField display = new JTextField();
		add(display, BorderLayout.PAGE_START);
		Frame buttons = new Frame();
		buttons.setLayout(new FlowLayout());
		JButton one = new JButton("1");
		buttons.add(one);
		buttons.setVisible(true);
		add(buttons, BorderLayout.CENTER);
	}

}