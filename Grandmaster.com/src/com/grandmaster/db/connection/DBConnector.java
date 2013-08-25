package com.grandmaster.db.connection;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DBConnector {

    private final static Log    logger               = LogFactory.getLog(DBConnector.class);

    private final static String DB_PROPERTY_FILENAME = "grandmaster_db.properties";

    private static final String DB_DRIVER_CLASS      = "com.mysql.jdbc.Driver";
    private static Properties   grandMasterProps     = null;

    public Connection           con;

    static {
        try {
            // Registering mysql driver
            logger.info("Loading mysql driver to classloader : " + DB_DRIVER_CLASS);
            Class.forName(DB_DRIVER_CLASS);
            logger.info("Completed Loading mysql driver to classloader : " + DB_DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            logger.error("Exception while loading mysql driver to classloader : " + DB_DRIVER_CLASS, e);
            System.exit(1);
        }
        loadProperties();// Load DB properties
    }

    private static boolean loadProperties() {
        logger.info("Loading DB properties from file");
        grandMasterProps = new Properties();
        try {            
            grandMasterProps.load(DBConnector.class.getResourceAsStream(DB_PROPERTY_FILENAME));
            logger.info("DB properties loaded successfully");
        } catch (IOException | NullPointerException ioe) {
            logger.error("IOException | NullPointerExcetion while loading database properties, filename : " + DB_PROPERTY_FILENAME, ioe);
            grandMasterProps.putAll(getDefaultDBConfig());
        }
        System.setProperties(grandMasterProps);
        return true;
    }

    private static Map<String, String> getDefaultDBConfig() {
        Map<String, String> properties = new HashMap<String, String>();

        properties.put("grandmaster.db.host", "localhost");
        properties.put("grandmaster.db.port", "3303");
        properties.put("grandmaster.db.name", "grandmaster");
        properties.put("grandmaster.db.user", "root");
        properties.put("grandmaster.db.password", "pa$$word");

        return properties;
    }

    public void createConnection() {
        logger.debug("Creating new DB connection");
        try {
            con = DriverManager.getConnection(getDB_URL(), grandMasterProps.getProperty("grandmaster.db.user"),
                    grandMasterProps.getProperty("grandmaster.db.password"));
            logger.debug("Creating new DB connection");
        } catch (SQLException e) {
            logger.fatal("Failed to create DB Connection , System exiting ", e);
            System.exit(1);
        }

    }

    public boolean closeConnection() {
        logger.debug("Closing DB connection...");
        if (con != null) {
            try {
                con.close();
                logger.debug("DB connection closed successfully");
                return true;
            } catch (SQLException e) {
                logger.error("Failed to close DB connection", e);
                return false;
            }
        } else {
            logger.info("There is no connections created");
            return true;
        }
    }

    public Connection getConnection() {
        return con;
    }

    public boolean isConnected() {
        return (con != null);
    }

    private static String getDB_URL() {
        String URL = "jdbc://";
        URL += grandMasterProps.getProperty("grandmaster.db.host") + ":" + grandMasterProps.getProperty("grandmaster.db.port");
        URL += "/" + grandMasterProps.getProperty("grandmaster.db.name");
        return URL;
    }

}
