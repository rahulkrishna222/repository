package com.grandmaster.db.service.impl;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.connection.DBConnector;

import com.grandmaster.db.entity.Login;
import com.grandmaster.db.entity.PasswordRecovery;
import com.grandmaster.db.entity.UserList;
import com.grandmaster.db.entity.UserProfile;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.util.GrandmasterUtil;

public class UserProfileServiceImpl implements UserProfileService {

    private final Log   logger = LogFactory.getLog(UserProfileServiceImpl.class);

    private DBConnector connector;

    public UserProfileServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public UserProfile save(Object entity) {
        // TODO Write Log messages

        connector.createConnection();

        UserProfile userProfile = (UserProfile) entity;

        PreparedStatement prepStmt;
        try {
            // (id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,
            // mobile_number,home_number,creation_time,modification_time,is_admin)

            prepStmt = connector.getConnection().prepareStatement(UserProfile.INSERT_SQL_QUERY_V, Statement.RETURN_GENERATED_KEYS);

            prepStmt.setString(1, userProfile.getFirstName());
            prepStmt.setString(2, userProfile.getLastName());
            prepStmt.setTimestamp(3, userProfile.getDob());
            prepStmt.setString(4, userProfile.getEmail());
            prepStmt.setString(5, userProfile.getAddress1());
            prepStmt.setString(6, userProfile.getAddress2());
            prepStmt.setString(7, userProfile.getCity());
            prepStmt.setString(8, userProfile.getState());
            prepStmt.setString(9, userProfile.getZipCode());
            prepStmt.setString(10, userProfile.getCountry());
            prepStmt.setString(11, userProfile.getMobileNumber());
            prepStmt.setString(12, userProfile.getHomeNumber());
            prepStmt.setTimestamp(13, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setTimestamp(14, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            prepStmt.setString(15, String.valueOf(userProfile.getIsAdmin()));
            prepStmt.setString(16,
                    userProfile.getImageData() != null ? userProfile.getImageData() : GrandmasterUtil.getDefaultImageBase64());
            prepStmt.setInt(17, 0);

            int rowsAffected = prepStmt.executeUpdate();

            if (rowsAffected == 0) {
                return null;
            } else {
                ResultSet genKey = prepStmt.getGeneratedKeys();
                if (genKey != null && genKey.next()) {
                    userProfile.setUserId(genKey.getInt(1));
                } else {
                    return null;
                }
            }

            /*
             * if (newUserResultSet != null) {
             * userProfile = parseResultSet(newUserResultSet);
             * }
             */
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
    public UserProfile update(Object entity, int id) {
        connector.createConnection();

        UserProfile userProfile = (UserProfile) entity;

        PreparedStatement prepStmt;
        try {
            // (id,first_name,last_name,dob,email,address1,address2,city,state,zip,country,
            // mobile_number,home_number,creation_time,modification_time,is_admin)

            prepStmt = connector.getConnection().prepareStatement(UserProfile.UPDATE_SQL_QUERY);

            prepStmt.setString(1, userProfile.getFirstName());
            prepStmt.setString(2, userProfile.getLastName());
            prepStmt.setTimestamp(3, userProfile.getDob());
            prepStmt.setString(4, userProfile.getEmail());
            prepStmt.setString(5, userProfile.getAddress1());
            prepStmt.setString(6, userProfile.getAddress2());
            prepStmt.setString(7, userProfile.getCity());
            prepStmt.setString(8, userProfile.getState());
            prepStmt.setString(9, userProfile.getZipCode());
            prepStmt.setString(10, userProfile.getCountry());
            prepStmt.setString(11, userProfile.getMobileNumber());
            prepStmt.setString(12, userProfile.getHomeNumber());
            prepStmt.setTimestamp(13, new Timestamp((System.currentTimeMillis() / 1000) * 1000));
            prepStmt.setString(14, String.valueOf(userProfile.getIsAdmin()));

            // Param number 15 is used for where clause. ie., the ID of user.
            prepStmt.setInt(15, id);
            int rowsAffected = prepStmt.executeUpdate();
            if (rowsAffected > 0) {
                userProfile = select(id);
            } else {
                return null;
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
    public UserProfile select(Integer id) {
        try {
            connector.createConnection();
            String selectQuery = "SELECT * FROM " + UserProfile.TBL_NAME + " where id = ?";

            PreparedStatement prepStmt = connector.getConnection().prepareStatement(selectQuery);
            prepStmt.setInt(1, id);

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
            connector.closeConnection();
        }

        return null;
    }

    @Override
    public List<UserProfile> findAll(Integer start, Integer count) throws SQLException {
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
                List<UserProfile> userProfilesList = new ArrayList<>();
                while (userProfiles != null && !userProfiles.isAfterLast()) {
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
        if (set != null && set.next()) {
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
            userProfile.setMobileNumber(set.getString("mobile_number"));
            userProfile.setHomeNumber(set.getString("home_number"));
            userProfile.setCreationTime(set.getTimestamp("creation_time"));
            userProfile.setModificationTime(set.getTimestamp("modification_time"));
            userProfile.setImageData(set.getString("image"));
            userProfile.setRating(set.getInt("rating"));

            return userProfile;
        }
        return null;
    }

    @Override
    public int changePassword(String username, String password, String newPassword, boolean isAdmin) {
        try {
            connector.getConnection();

            String query = "SELECT * FROM " + Login.TBL_NAME + " WHERE username = ? AND password_hash = ?";

            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);
            pstmt.setString(1, username);

            if (isValidMD5(password)) {
                pstmt.setString(2, password);
            } else {
                pstmt.setString(2, GrandmasterUtil.getMD5Hash(password));
            }

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet != null && resultSet.next()) {
                // User Password is correct, now check that new password is not in last 3 password
                String newPasswordHash = GrandmasterUtil.getMD5Hash(newPassword);
                if (resultSet.getString("old_password_1") != null && resultSet.getString("old_password_1").equals(newPasswordHash)) {
                    return 2;
                }

                if (resultSet.getString("old_password_2") != null && resultSet.getString("old_password_2").equals(newPasswordHash)) {
                    return 2;
                }

                if (resultSet.getString("old_password_2") != null && resultSet.getString("old_password_2").equals(newPasswordHash)) {
                    return 2;
                }
                // All criteria where satisfied now update password

                String updateQuery = "UPDATE " + Login.TBL_NAME
                        + " SET password_hash = ?, old_password_1 = ?, old_password_2 = ?, old_password_3 = ? WHERE id = ?";

                PreparedStatement updatePstmt = connector.getConnection().prepareStatement(updateQuery);

                updatePstmt.setString(1, newPasswordHash);
                updatePstmt
                        .setString(2, resultSet.getString("password_hash") != null ? resultSet.getString("password_hash") : null);
                updatePstmt.setString(3, resultSet.getString("old_password_1") != null ? resultSet.getString("old_password_1")
                        : null);
                updatePstmt.setString(4, resultSet.getString("old_password_2") != null ? resultSet.getString("old_password_1")
                        : null);

                updatePstmt.setInt(5, resultSet.getInt("id"));

                System.out.println(updatePstmt.toString());
                int numOfRowsUpdated = updatePstmt.executeUpdate();

                pstmt.close();
                if (numOfRowsUpdated > 0) { // Means if number if rows updated
                    // means some record is updated
                    return 1;
                } else {
                    return -1;
                }

            } else {
                return 1;
            }
        } catch (Exception e) {
            // TODO : Write log message and handle exception
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String retrievePassword(String email, String machineIP) {

        connector.createConnection();
        Integer userId = null;

        try {
            String query = "select id from user_profile where email = ?";
            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);
            pstmt.setString(1, email);

            ResultSet rs = pstmt.executeQuery();

            if (rs != null && rs.next()) {
                userId = rs.getInt(1);
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            PreparedStatement pstmt = connector.getConnection().prepareStatement(PasswordRecovery.INSERT_QUERY,
                    Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, userId);
            String uuid = UUID.randomUUID().toString();
            pstmt.setString(2, uuid);
            // 86400000ms == 1 day
            pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis() + 86400000));

            int numOfRecAffected = pstmt.executeUpdate();

            if (numOfRecAffected > 0) {
                ResultSet primaryKey = pstmt.getGeneratedKeys();
                primaryKey.next();
                Integer pk = primaryKey.getInt(1);
                if (pk != null) {
                    return uuid;
                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer recoverPassword(String UUID) {
        connector.createConnection();

        try {
            String query = "select * from " + PasswordRecovery.TBL_PASSWORD_RECOVERY + " where uuid = ? and expiration_time < ? ";

            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);

            pstmt.setString(1, UUID);
            pstmt.setTimestamp(2, new Timestamp((System.currentTimeMillis() / 1000) * 1000));
            System.out.println(pstmt.toString());

            ResultSet rs = pstmt.executeQuery();

            if (rs != null && rs.next()) {
                Integer userId = rs.getInt("userId");
                return userId;
            }
        } catch (SQLException sqe) {
            sqe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserList getOnlineUserList() {

        connector.createConnection();

        try {

            String query = "select distinct ol.id as id, up.id as userId, up.country country, concat(up.first_name,' ',up.last_name) as name, up.rating as rank from online_user_list ol, user_profile up where up.id = ol.userId";
            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);

            ResultSet rs = pstmt.executeQuery();
            List<Map<String, String>> onlineUserList = null;

            if (rs != null) {
                Map<String, String> onlineUser = new HashMap<String, String>();
                onlineUserList = new ArrayList<>();
                while (rs.next()) {
                    onlineUser.put("name", rs.getString("name"));
                    onlineUser.put("country", rs.getString("country"));
                    onlineUser.put("userId", rs.getString("userId"));
                    onlineUser.put("rating", rs.getString("rank"));

                    onlineUserList.add(onlineUser);
                }
                UserList onlineUsersList = new UserList();
                onlineUsersList.setOnlineUsers(onlineUserList);
                
                return onlineUsersList;
            } else {
                return null;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connector.closeConnection();
        }
        return null;
    }

    public boolean isValidMD5(String s) {
        return s.matches("[a-fA-F0-9]{32}");
    }
}
