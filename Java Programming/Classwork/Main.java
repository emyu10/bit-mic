/*
 * An attempt to create a Swing window.
 */
import javax.swing.JDialog;
import javax.swing.JLabel;

class Main {
	public static void main(String[] args) {
		JDialog d = new JDialog();
		d.setTitle("Majaa Window");
		d.add(new JLabel("Someone is upset"));
		d.setSize(200, 200);
		d.show();
	}
}
