package iot.connection;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionManager {
    private static final String url="jdbc:mysql://localhost:3306/uklon";
    private static final String user="root";
    private static final String password="sugoi";

    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return connection;
    }
}
