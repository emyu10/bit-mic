package tabbedpane;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabbedPaneFrame extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    public TabbedPaneFrame() {
        setTitle("TabbedPane Test");
        setSize(WIDTH, HEIGHT);

        final JTabbedPane tabbedPane = new JTabbedPane();

        ImageIcon icon = new ImageIcon("icons/yellow-ball.png");

        tabbedPane.addTab("Mercury", icon, null);
        tabbedPane.addTab("Venus", icon, null);
        tabbedPane.addTab("Earth", icon, null);
        tabbedPane.addTab("Mars", icon, null);
        tabbedPane.addTab("Jupiter", icon, null);
        tabbedPane.addTab("Saturn", icon, null);
        tabbedPane.addTab("Uranus", icon, null);
        tabbedPane.addTab("Neptune", icon, null);
        tabbedPane.addTab("Pluto", icon, null);

        getContentPane().add(tabbedPane, "Center");

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent event) {
                if (tabbedPane.getSelectedComponent() == null) {
                    int n = tabbedPane.getSelectedIndex();
                    String title = tabbedPane.getTitleAt(n);
                    ImageIcon planetIcon = new ImageIcon("planets/" + title + ".png");
                    tabbedPane.setComponentAt(n, new JLabel(planetIcon));

                    tabbedPane.setIconAt(n, new ImageIcon("icons/red-ball.png"));
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton wrapButton = new JRadioButton("Wrap tabs");
        wrapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tabbedPane.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
            }
        });

        buttonPanel.add(wrapButton);
        buttonGroup.add(wrapButton);
        wrapButton.setSelected(true);
        JRadioButton scrollButton = new JRadioButton("Scroll Tabs");
        scrollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
            }
        });

        buttonPanel.add(scrollButton);
        buttonGroup.add(scrollButton);

        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }
}
