package com.grandmaster.db.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class DBConnector {
    private static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";

    public Connection           con;

    static {
        try {
            // Registering mysql driver
            Class.forName(DB_DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            // TODO Add logger for error displaying
            e.printStackTrace();
        }
        loadProperties();//
    }

    private static boolean loadProperties() {
        // Write code to load property from file
        return false;
    }

    public void createConnection() {
        try {
            con = DriverManager.getConnection("Need to create DB URL");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean closeConnection() {
        if (con != null) {
            try {
                con.close();
                return true;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    public Connection getConnection() {
        return con;
    }

    public boolean isConnected() {
        return (con != null);
    }

}
