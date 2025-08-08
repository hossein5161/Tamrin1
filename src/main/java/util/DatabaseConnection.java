package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public  Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/library_manager";
        String user = "postgres";
        String password = "1375";
        return DriverManager.getConnection(url, user, password);

    }
}
