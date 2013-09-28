package com.grandmaster.db.service;

import java.sql.Timestamp;
import java.util.Map;

import com.grandmaster.db.DBOperation;
import com.grandmaster.db.entity.UserList;

public interface UserProfileService extends DBOperation {

    public int changePassword(String username, String password, String newPassword, boolean isAdmin);

    public String retrievePassword(String email, String machineIP);
    
    public Integer recoverPassword(String UUID);
    
    public UserList getOnlineUserList();

}
