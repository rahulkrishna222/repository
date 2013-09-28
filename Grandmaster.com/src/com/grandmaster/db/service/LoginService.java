/**
 * 
 */
package com.grandmaster.db.service;

import com.grandmaster.db.DBOperation;
import com.grandmaster.db.entity.Login;

public interface LoginService extends DBOperation {

    public Integer validateLogin(String username, String password, String machine);
    
    public boolean addUserToOnlineList(Integer userId, String remoteIP);
    
    public boolean removeUserFromOnlineList(Integer userId);
    
    

}
