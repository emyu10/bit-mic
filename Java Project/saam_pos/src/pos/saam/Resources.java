package pos.saam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Resources {
    private static Properties props = new Properties();

    private static void loadProps() throws IOException {
        FileInputStream fis = new FileInputStream("settings.properties");
        props.load(fis);
    }


    public static String appTitle() {
        try {
            loadProps();
            return props.getProperty("app.title");
        } catch (IOException e) {
            return "POS";
        }
    }

    public static Properties getProperties() {
        try {
            loadProps();
            return props;
        } catch (IOException e) {
            Properties properties = new Properties();
            properties.put("app.title", "Saam Investments POS");
            properties.put("jdbc.drivers", "com.mysql.jdbc.Driver");
            properties.put("jdbc.url", "jdbc:mysql://localhost:3306/saam_db");
            properties.put("jdbc.username", "saam_user");
            properties.put("jdbc.password", "1234");
            return properties;
        }
    }
}
