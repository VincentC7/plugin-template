package fr.lordhydra.dummyPlugin.services;

import fr.lordhydra.dummyPlugin.db.DbConnection;

import java.sql.Connection;

public class StorageService {

    private static StorageService instance;

    private final DbConnection dbConnection;

    private StorageService() {
        dbConnection = new DbConnection();
    }

    public static StorageService getInstance() {
        if (instance == null) instance = new StorageService();
        return instance;
    }

    public void init() {
        dbConnection.connect();
    }

    public void stop() {
        dbConnection.close();
    }

    public Connection getConnection(){
        return dbConnection.getConnection();
    }
}
