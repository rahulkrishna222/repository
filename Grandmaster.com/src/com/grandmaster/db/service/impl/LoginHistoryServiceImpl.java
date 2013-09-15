package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.grandmaster.db.service.LoginHistoryService;

public class LoginHistoryServiceImpl implements LoginHistoryService {

    @Override
    public Integer save() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer update() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void select(Integer id) {
        // TODO Auto-generated method stub

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
