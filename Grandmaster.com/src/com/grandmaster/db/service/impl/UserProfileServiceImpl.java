package com.grandmaster.db.service.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.connection.DBConnector;

import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.UserProfileService;

public class UserProfileServiceImpl implements UserProfileService {

    private final Log   logger = LogFactory.getLog(UserProfileServiceImpl.class);

    private DBConnector connector;

    public UserProfileServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public Object save(Object entity) {
        // TODO Write Log messages

        connector.createConnection();

        UserProfile userProfile = (UserProfile) entity;

        PreparedStatement prepStmt;
        try {
            // (id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,
            // mobile_number,home_number,creation_time,modification_time,is_admin)

            prepStmt = connector.getConnection().prepareStatement(UserProfile.INSERT_SQL_QUERY_V);

            prepStmt.setString(0, userProfile.getFirstName());
            prepStmt.setString(1, userProfile.getLastName());
            prepStmt.setTimestamp(2, userProfile.getDob());
            prepStmt.setString(3, userProfile.getEmail());
            prepStmt.setString(4, userProfile.getAddress1());
            prepStmt.setString(5, userProfile.getAddress2());
            prepStmt.setString(6, userProfile.getCity());
            prepStmt.setString(7, userProfile.getState());
            prepStmt.setString(8, userProfile.getZipCode());
            prepStmt.setString(9, userProfile.getCountry());
            prepStmt.setLong(10, userProfile.getMobileNumber());
            prepStmt.setLong(11, userProfile.getHomeNumber());
            prepStmt.setTimestamp(12, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setTimestamp(13, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setObject(14, userProfile.getIsAdmin());

            ResultSet newUserResultSet = prepStmt.executeQuery();

            if (newUserResultSet != null) {
                userProfile = parseResultSet(newUserResultSet);
            }
            prepStmt.close();

            return userProfile;
        } catch (SQLException e) {
            // TODO Write Log messages
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();
        }

        return null;
    }

    @Override
    public Object update(Object entity, int id) {
        connector.createConnection();

        UserProfile userProfile = (UserProfile) entity;

        PreparedStatement prepStmt;
        try {
            // (id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,
            // mobile_number,home_number,creation_time,modification_time,is_admin)

            prepStmt = connector.getConnection().prepareStatement(UserProfile.UPDATE_SQL_QUERY);

            prepStmt.setString(0, userProfile.getFirstName());
            prepStmt.setString(1, userProfile.getLastName());
            prepStmt.setTimestamp(2, userProfile.getDob());
            prepStmt.setString(3, userProfile.getEmail());
            prepStmt.setString(4, userProfile.getAddress1());
            prepStmt.setString(5, userProfile.getAddress2());
            prepStmt.setString(6, userProfile.getCity());
            prepStmt.setString(7, userProfile.getState());
            prepStmt.setString(8, userProfile.getZipCode());
            prepStmt.setString(9, userProfile.getCountry());
            prepStmt.setLong(10, userProfile.getMobileNumber());
            prepStmt.setLong(11, userProfile.getHomeNumber());
            prepStmt.setTimestamp(12, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setTimestamp(13, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setObject(14, userProfile.getIsAdmin());

            // Param number 15 is used for where clause. ie., the ID of user.
            prepStmt.setInt(15, id);
            ResultSet newUserResultSet = prepStmt.executeQuery();

            if (newUserResultSet != null) {
                userProfile = parseResultSet(newUserResultSet);
            }
            prepStmt.close();

            return userProfile;
        } catch (SQLException e) {
            // TODO Write Log messages
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();
        }

        return null;
    }

    @Override
    public Integer delete(int id) {
        try {
            // TODO Write Log messages

            connector.createConnection();
            Statement stmt = connector.getConnection().createStatement();

            String deleteQuery = UserProfile.DELETE_SQL_QUERY + id;

            if (stmt.execute(deleteQuery)) {
                // TODO return a message that the user profile entry deleted
            } else {
                // TODO return a message that the user profile entry deleted
            }

        } catch (Exception e) {

        } finally {
            connector.closeConnection();
        }
        return null;
    }

    @Override
    public Object select(Integer id) {
        try {
            connector.createConnection();
            String selectQuery = "SELECT * FROM " + UserProfile.TBL_NAME + " where id = ?";

            PreparedStatement prepStmt = connector.getConnection().prepareStatement(selectQuery);
            prepStmt.setInt(0, id);

            ResultSet resultSet = prepStmt.executeQuery();

            UserProfile userProfile = null;

            if (resultSet != null) {
                userProfile = parseResultSet(resultSet);
            }
            return userProfile;

        } catch (Exception e) {
            // TODO Write Log messages
            e.printStackTrace();
            // TODO write proper exception handling codes
        } finally {
            // TODO Write Log messages
        }

        return null;
    }

    @Override
    public List<Object> findAll(Integer start, Integer count) throws SQLException {
        // Creating connection

        // TODO Write Log messages
        connector.createConnection();

        PreparedStatement prepStmt;
        try {
            prepStmt = connector.getConnection().prepareStatement("SELECT * from " + UserProfile.TBL_NAME);
            /*
             * Will set later
             * prepStmt.setInt(0, start);
             * prepStmt.setInt(1, count);
             */
            ResultSet userProfiles = prepStmt.executeQuery();
            if (userProfiles != null) {
                List<Object> userProfilesList = new ArrayList<>();
                while (userProfiles.next()) {
                    UserProfile user = parseResultSet(userProfiles);
                    userProfilesList.add(user);
                }
                prepStmt.close();

                return userProfilesList;
            }
        } catch (SQLException e) {
            // TODO Add logger for messaging , Also add proper exception handle
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();

        }

        return null;
    }

    private static UserProfile parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            UserProfile userProfile = new UserProfile();

            // TODO Write Log messages

            userProfile.setUserId(set.getInt("id"));
            userProfile.setFirstName(set.getString("first_name"));
            userProfile.setLastName(set.getString("last_name"));
            userProfile.setDob(set.getTimestamp("dob"));
            userProfile.setEmail(set.getString("email"));
            userProfile.setAddress1(set.getString("address1"));
            userProfile.setAddress2(set.getString("address2"));
            userProfile.setCity(set.getString("city"));
            userProfile.setState(set.getString("state"));
            userProfile.setZipCode(set.getString("zip"));
            userProfile.setCountry(set.getString("country"));
            userProfile.setIsAdmin(set.getString("is_admin").charAt(0));
            userProfile.setMobileNumber(set.getLong("mobile_number"));
            userProfile.setHomeNumber(set.getLong("home_number"));
            userProfile.setCreationTime(set.getTimestamp("creation_time"));
            userProfile.setModificationTime(set.getTimestamp("modification_time"));

            return userProfile;
        }
        return null;
    }

}
