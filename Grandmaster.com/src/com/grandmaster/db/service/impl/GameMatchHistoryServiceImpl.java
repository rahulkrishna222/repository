package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.grandmaster.db.entity.GameMatchHistory;
import com.grandmaster.db.service.GameMatchHistoryService;

public class GameMatchHistoryServiceImpl implements GameMatchHistoryService {

   
    
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


}
