package popupmenu01;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample {
    PopupMenuExample() {
        final JFrame f = new JFrame("PopupMenu Example");
        JPopupMenu popupMenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut", new ImageIcon("icons/cut.png"));
        JMenuItem copy = new JMenuItem("Copy", new ImageIcon("icons/copy.png"));
        JMenuItem paste = new JMenuItem("Paste", new ImageIcon("icons/paste.png"));

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(f, e.getX(), e.getY());
            }
        });

        f.add(popupMenu);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
