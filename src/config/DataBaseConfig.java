package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
     static String url= "jdbc:mysql://localhost:3306/Bookmymovies";
     static String password ="Anuj@123";
     static String username="root";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
