package com.grandmaster.db.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserList {
    
    private List<UserProfile> userProfileList = new ArrayList<>();
    
    private List<Map<String, String>> onlineUsers = new ArrayList<>();

    /**
     * @return the userProfileList
     */
    public List<UserProfile> getUserProfileList() {
        return userProfileList;
    }

    /**
     * @param userProfileList the userProfileList to set
     */
    public void setUserProfileList(List<UserProfile> userProfileList) {
        this.userProfileList = userProfileList;
    }

    /**
     * @return the onlineUsers
     */
    public List<Map<String, String>> getOnlineUsers() {
        return onlineUsers;
    }

    /**
     * @param onlineUsers the onlineUsers to set
     */
    public void setOnlineUsers(List<Map<String, String>> onlineUsers) {
        this.onlineUsers = onlineUsers;
    }
    
    
    

}
