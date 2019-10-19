package awtexample;

import java.awt.*;

public class SimpleFrame extends Frame {
	SimpleFrame() {
		Button b = new Button("Botton");
		
		//setting button position on screen
		//b.setBounds(100, 100, 100, 100);
		
		//adding button into frame
		add(b);
		
		//setting frame width and height
		setSize(500,300);
		
		setTitle("This is my first AWT example");
		
		setLayout(new FlowLayout());
		setVisible(true);
	}
 	
	public static void main(String[] args) {
		SimpleFrame f = new SimpleFrame();
//		f.show();
	}
}