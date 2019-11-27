package emyu.learning.ui;

import javax.swing.*;
import java.awt.*;
import java.net.Inet4Address;

import emyu.learning.LanChat;

public class UserPane extends JScrollPane {
    private JPanel container = new JPanel();
    private JViewport viewport;
    private LanChat parent;
    public UserPane(LanChat parent) {
        this.parent = parent;
        viewport = getViewport();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        //container.add(new UserView("emyu10", null));
        viewport.setMinimumSize(new Dimension(200, parent.getHeight()));
        viewport.setMaximumSize(new Dimension(200, parent.getHeight()));
        viewport.add(container);
        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        JLabel headerLabel = new JLabel("Online Users");
        headerLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        setColumnHeaderView(headerLabel);
    }

    public void addUser(UserView user) {
        container.add(user);
        updateUI();
    }
}
