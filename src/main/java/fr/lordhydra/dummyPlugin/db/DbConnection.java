package fr.lordhydra.dummyPlugin.db;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private final DbCredentials dbCredentials;

    @Getter
    private Connection connection;

    public DbConnection() {
        dbCredentials = new DbCredentials();
    }

    public void connect() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(
                    dbCredentials.toUri(),
                    dbCredentials.getDbUser(),
                    dbCredentials.getDbPass()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            if (connection!=null && !connection.isClosed()){
                connection.close();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
