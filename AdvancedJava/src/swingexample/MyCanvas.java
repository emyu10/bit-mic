package swingexample;

import java.awt.*;

import javax.swing.JFrame;

public class MyCanvas extends Canvas {

	public static void main(String[] args) {
		MyCanvas m = new MyCanvas();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(600, 600);
		f.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("images/p3.gif");
		g.drawImage(i, 120, 100, this);
	}

}
