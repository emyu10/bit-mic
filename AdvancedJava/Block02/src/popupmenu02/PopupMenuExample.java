package popupmenu02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample {
    PopupMenuExample() {
        final JFrame f = new JFrame("PopupMenu Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);

        final JPopupMenu popupMenu = new JPopupMenu("Edit");
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

        cut.addActionListener((ActionEvent actionEvent) -> {
                label.setText("Cut MenuItem Clicked");
        });

        copy.addActionListener((ActionEvent actionEvent) -> {
            label.setText("Copy MenuItem Clicked");
        });

        paste.addActionListener((ActionEvent actionEvent) -> {
            label.setText("Paste MenuItem Clicked");
        });

        f.add(label);
        f.add(popupMenu);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
