package scrollpane;

import javax.swing.*;

public class ScrollPaneDemo extends JFrame {
    public ScrollPaneDemo() {
        super("ScrollPane demo");
        ImageIcon img = new ImageIcon("images/child.png");
        JScrollPane png = new JScrollPane(new JLabel(img));

        getContentPane().add(png);
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}
