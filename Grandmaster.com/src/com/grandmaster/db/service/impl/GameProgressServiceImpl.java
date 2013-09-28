package com.grandmaster.db.service.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import com.grandmaster.db.connection.DBConnector;
import com.grandmaster.db.entity.GameProgress;
import com.grandmaster.db.service.GameProgressService;

public class GameProgressServiceImpl implements GameProgressService {
    private DBConnector connector;

    public GameProgressServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public <T> T save(Object entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GameProgress update(Object entity, int id) {
        GameProgress gameProgress = (GameProgress) entity;

        connector.createConnection();

        try {
            PreparedStatement pstmt = connector.getConnection().prepareStatement(GameProgress.UPDATE_SQL_QUERY);
            pstmt.setString(1, gameProgress.getPosition());
            pstmt.setInt(2, id);

            int numOfRecordUpdated = pstmt.executeUpdate();
            if (numOfRecordUpdated > 0) {
                return gameProgress;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GameProgress select(Integer id) {
        connector.createConnection();

        try {
            String query = "Select * from game_progress where match_id = ?";
            PreparedStatement pstmt = connector.getConnection().prepareStatement(query);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            if (rs != null && rs.next()) {
                GameProgress gameProgress = parseResultSet(rs);

                return gameProgress;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<?> findAll(Integer start, Integer count) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    private static GameProgress parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            GameProgress gameProgress = new GameProgress();

            gameProgress.setId(set.getInt("id"));
            gameProgress.setMatchId(set.getInt("match_id"));
            gameProgress.setPosition(set.getString("position"));

            return gameProgress;
        }
        return null;
    }

    @Override
    public boolean challengeUser(Integer challengingTo, Integer challengedBy) {
        connector.createConnection();

        try {
            String query = "insert into game_request(id, requested_by, requested_to, requested_time, status) values(null, ?, ?, ?, ?)";
            PreparedStatement pstmt = connector.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, challengedBy);
            pstmt.setInt(2, challengingTo);
            pstmt.setTimestamp(3, new Timestamp((System.currentTimeMillis() / 1000) * 1000));
            pstmt.setString(4, "P");

            int numOfRows = pstmt.executeUpdate();

            if (numOfRows > 0) {
                ResultSet pkSet = pstmt.getGeneratedKeys();

                if (pkSet != null && pkSet.next()) {
                    Integer id = pkSet.getInt(1);
                }
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Integer isChallengedMe(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

}
