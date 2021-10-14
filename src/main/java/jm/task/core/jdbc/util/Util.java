package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import java.sql.*;

public class Util {
    private static SessionFactory sessionFactory;
    private static Connection connection = null;


    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
