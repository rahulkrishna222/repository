package com.grandmaster.db.service;

import com.grandmaster.db.DBOperation;

public interface UserProfileService extends DBOperation {

    public int changePassword(String username, String password, String newPassword, boolean isAdmin);

    public boolean retrievePassword(String email, String machineIP);

}
