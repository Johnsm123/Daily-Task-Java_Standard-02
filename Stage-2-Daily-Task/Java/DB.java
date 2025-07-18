import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.FileReader;

public class DB {
    public static Connection getConnection() throws Exception {
        Properties props = new Properties();
        props.load(new FileReader("database.properties"));

        String driver = props.getProperty("DB_DRIVER_CLASS");
        String url = props.getProperty("DB_URL");
        String username = props.getProperty("DB_USERNAME");
        String password = props.getProperty("DB_PASSWORD");

        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }
}
