package com.grandmaster.db.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.connection.DBConnector;
import com.grandmaster.db.entity.Login;
import com.grandmaster.db.service.LoginService;
import com.grandmaster.db.service.UserProfileService;
import com.grandmaster.util.GrandmasterUtil;

public class LoginServiceImpl implements LoginService {

    private Log         logger = LogFactory.getLog(LoginServiceImpl.class);

    private DBConnector connector;

    public LoginServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public Object save(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object update(Object entity, int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object select(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Object> findAll(Integer start, Integer count) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer validateLogin(String username, String password, String machine) {
        try {
            connector.createConnection();

            String passwordHash = null;
            try {
                passwordHash = GrandmasterUtil.getMD5Hash(password);
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                // TODO Handle system exception and Write Log messages
                e.printStackTrace();
            }
            String query = "SELECT * FROM " + Login.TBL_NAME + " WHERE username = ? AND password_hash = ?";

            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);
            ResultSet resultSet = pstmt.executeQuery();

            if (pstmt.execute()) {
                // User Login validation successful
                // Now return the user id
                // write log messages
                return resultSet.getInt("id");
            } else {
                // Means login failed
                // Write log messages
                return -1;
            }

        } catch (SQLException e) {
            // TODO Write Log messages and handle exception
        } finally {
            try {
                connector.getConnection().close();
            } catch (SQLException e) {
                // TODO Write log messages and handle exception
                e.printStackTrace();
            }
        }
        return null;
    }

    private static Login parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            Login login = new Login();

            // TODO Write Log messages

            login.setUserId(set.getInt("id"));
            login.setEmail(set.getString("username"));
            login.setPasswordHash(set.getString("password_hash"));
            login.setOldPasswordHash1(set.getString("old_password_1"));
            login.setOldPasswordHash2(set.getString("old_password_2"));
            login.setOldPasswordHash3(set.getString("old_password_3"));
            login.setStatus(set.getString("status").charAt(0));
            login.setCreationTime(set.getTimestamp("creation_time"));
            login.setModificationTime(set.getTimestamp("modification_time"));

            return login;
        }
        return null;
    }

}
