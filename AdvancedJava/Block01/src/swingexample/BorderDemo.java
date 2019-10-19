package swingexample;

import java.awt.*;

public class BorderDemo extends Frame {

	public static void main(String[] args) {
		BorderDemo screen = new BorderDemo("BorderLayout demo");
		screen.setSize(500, 250);
		screen.setVisible(true);
	}
	
	public BorderDemo(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		
		Button b1 = new Button("PAGE_START");
		add(b1, BorderLayout.PAGE_START);
		
		Button b2 = new Button("CENTER");
		add(b2, BorderLayout.CENTER);
		
		Button b3 = new Button("LINE_START");
		add(b3, BorderLayout.LINE_START);
		
		Button b4 = new Button("PAGE_END");
		add(b4, BorderLayout.PAGE_END);
		
		Button b5 = new Button("LINE_END");
		add(b5, BorderLayout.LINE_END);
	}

}