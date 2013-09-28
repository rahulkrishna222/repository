package com.grandmaster.db.service;

import com.grandmaster.db.DBOperation;

public interface GameProgressService extends DBOperation{

    public boolean challengeUser(Integer challengingTo, Integer challengedBy);
    
    public Integer isChallengedMe(Integer userId);
}
