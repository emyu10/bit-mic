package swingexample;

import java.awt.*;

public class FlowLayoutRTL extends Frame {

	public static void main(String[] args) {
		FlowLayoutRTL screen = new FlowLayoutRTL("FlowLayout demo");
		screen.setSize(400, 150);
		screen.setVisible(true);
	}
	
	public FlowLayoutRTL(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		Button[] buttons = new Button[8];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button("Button " + (i + 1));
			add(buttons[i]);
		}
		
		setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	}
}
