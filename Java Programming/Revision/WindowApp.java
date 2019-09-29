import javax.swing.JFrame;

class WindowApp extends JFrame {
    public static void main(String[] args) {
        WindowApp app = new WindowApp("My app");
        app.setSize(600, 600);
        app.setVisible(true);
    }

    WindowApp(String title) {
        super(title);
    }
}