package WebCrawling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sw on 2016. 4. 20..
 */
public class ConnectionMaker {
    public Connection makerConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/webcrawling", "webcrawling", "1234");
        return c;
    }
}