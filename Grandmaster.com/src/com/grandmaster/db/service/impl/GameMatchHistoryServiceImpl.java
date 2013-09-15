package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.grandmaster.db.service.GameMatchHistoryService;

public class GameMatchHistoryServiceImpl implements GameMatchHistoryService {

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
    
    private static GameMatchHistory parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
        	GameMatchHistory gameMatchHistory = new GameMatchHistory();

            // TODO Write Log messages

        	gameMatchHistory.setId(set.getInt("id"));
        	gameMatchHistory.setUserA(set.getInt("userAId"));
        	gameMatchHistory.setUserB(set.getInt("userBId"));
        	gameMatchHistory.setGameStarted(set.getTimestamp("game_started"));
        	gameMatchHistory.setGameEnded(set.getTimestamp("game_finished"));
        	gameMatchHistory.setWinnerUser(set.getInt("winner"));
        	gameMatchHistory.setGameStatus(set.getString("game_status").charAt(0));

            return gameMatchHistory;
        }
        return null;
    }


}
