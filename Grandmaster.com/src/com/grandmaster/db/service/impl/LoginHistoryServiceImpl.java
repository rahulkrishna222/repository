package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.grandmaster.db.entity.LoginHistory;
import com.grandmaster.db.service.LoginHistoryService;

public class LoginHistoryServiceImpl implements LoginHistoryService {

    @Override
    public <T> T save(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T update(Object entity, int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T select(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<?> findAll(Integer start, Integer count) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    private static LoginHistory parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            LoginHistory loginHistory = new LoginHistory();

            // TODO Write Log messages

            loginHistory.setId(set.getInt("id"));
            loginHistory.setUserId(set.getInt("user_id"));
            loginHistory.setLastLoggedInTime(set.getTimestamp("last_logged_in_time"));
            loginHistory.setMachineIp(set.getString("machine_ip"));

            return loginHistory;
        }
        return null;
    }

}
