import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private JLabel display = new JLabel("0");
    private JButton btnCount = new JButton("Count");
    private int count = 0;

    private Counter() {
        super("Counter");
        init();
    }

    private void init() {
        setLayout(null);
        display.setBounds(10, 10, 100, 50);
        btnCount.setBounds(10, 60, 100, 50);
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                display.setText(String.valueOf(count));
            }
        });
        add(display);
        add(btnCount);
    }

    private void showWindow() {
        setSize(120, 200);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.showWindow();
    }
}
