package emyu.learning.ui;

import javax.swing.*;
import java.awt.*;
import emyu.learning.LanChat;

public class UserPane extends JScrollPane {
    private JPanel container = new JPanel();
    private JViewport viewport;
    private LanChat parent;
    public UserPane(LanChat parent) {
        this.parent = parent;
        viewport = getViewport();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        viewport.setMinimumSize(new Dimension(200, parent.getHeight()));
        viewport.setMaximumSize(new Dimension(200, parent.getHeight()));
        viewport.add(container);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        JLabel headerLabel = new JLabel("Online Users");
        headerLabel.setFont(new Font("sans-serif", Font.BOLD, 20));
        setColumnHeaderView(headerLabel);
    }

    public void add(UserView user) {
        this.container.add(user);
    }
}