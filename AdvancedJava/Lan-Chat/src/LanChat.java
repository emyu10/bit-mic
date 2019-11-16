import javax.swing.*;
import java.awt.*;

public class LanChat extends JFrame {
    private JSplitPane appPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    private UserPane userPane = new UserPane();
    private ChatPane chatPane = new ChatPane();

    /**
     * The constructor.
     */
    private LanChat() {
        appPane.setLeftComponent(userPane);
        appPane.setRightComponent(chatPane);
        JButton b = new JButton("button");
        b.setLayout(new FlowLayout());
        add(appPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }

    /**
     * main method to launch the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new LanChat();
    }
}
