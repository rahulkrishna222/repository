package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.grandmaster.db.service.GameProgressService;

public class GameProgressServiceImpl implements GameProgressService {

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
    
    private static GameProgress parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
        	GameProgress gameProgress = new GameProgress();

            // TODO Write Log messages

        	gameProgress.setId(set.getInt("id"));
        	gameProgress.setMatchId(set.getInt("match_id"));
        	gameProgress.setOpponentAPosition(set.getString("opponent_A_element_pos"));
        	gameProgress.setOpponentBPosition(set.getString("opponent_B_element_pos"));
        	
            return gameProgress;
        }
        return null;
    }


}
