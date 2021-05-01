package toolbar01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ToolBarFrame extends JFrame {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel panel;

    public ToolBarFrame() {
        setTitle("ToolBarTest");
        setSize(WIDTH, HEIGHT);

        Container contentPane = getContentPane();
        panel = new JPanel();

        Action blueAction = new ColorAction("Blue", new ImageIcon("icons/blue-ball.png"), Color.blue);
        Action yellowAction = new ColorAction("Yellow", new ImageIcon("icons/yellow-ball.png"), Color.yellow);
        Action redAction = new ColorAction("Red", new ImageIcon("icons/red-ball.png"), Color.red);

        Action exitAction = new AbstractAction("Exit", new ImageIcon("icons/exit.png")) {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        };

        exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

        JToolBar bar = new JToolBar();
        bar.add(blueAction);
        bar.add(yellowAction);
        bar.add(redAction);
        bar.addSeparator();
        bar.add(exitAction);
        contentPane.add(bar, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);
        menu.addSeparator();
        menu.add(exitAction);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }



    class ColorAction extends AbstractAction {
        public ColorAction(String name, Icon icon, Color c) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, name + " background");
            putValue("Color", c);
        }

        public void actionPerformed(ActionEvent evt) {
            Color c = (Color) getValue("Color");
            panel.setBackground(c);
            panel.repaint();
        }
    }
}
