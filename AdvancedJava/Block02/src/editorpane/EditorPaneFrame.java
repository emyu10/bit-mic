package editorpane;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Stack;

public class EditorPaneFrame extends JFrame {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    public EditorPaneFrame() {
        setTitle("EditorPaneTest");
        setSize(WIDTH, HEIGHT);

        final Stack urlStack = new Stack();
        final JEditorPane editorPane = new JEditorPane();
        final JTextField url = new JTextField(30);

        editorPane.setEditable(false);
        editorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent event) {
                if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        urlStack.push(event.getURL().toString());
                        url.setText(event.getURL().toString());

                        editorPane.setPage(event.getURL());
                    } catch (IOException e) {
                        editorPane.setText("Exception: " + e.getLocalizedMessage());
                    }
                }
            }
        });

        final JCheckBox editable = new JCheckBox();
        editable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                editorPane.setEditable(editable.isSelected());
            }
        });

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    urlStack.push(url.getText());
                    editorPane.setPage(url.getText());
                } catch (IOException e) {
                    editorPane.setText("Exception: " + e);
                }
            }
        };

        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(listener);
        url.addActionListener(listener);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (urlStack.size() <= 1) return;
                try {
                    urlStack.pop();
                    String urlString = (String) urlStack.peek();
                    url.setText(urlString);

                    editorPane.setPage(urlString);
                } catch (IOException e) {
                    editorPane.setText("Exception: " + e);
                }
            }
        });

        Container contentPane = getContentPane();
        contentPane.add(new JScrollPane(editorPane), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.add(new JLabel("URL"));
        panel.add(url);
        panel.add(loadButton);
        panel.add(backButton);
        panel.add(new JLabel("Editable"));
        panel.add(editable);

        contentPane.add(panel, BorderLayout.SOUTH);
    }
}
