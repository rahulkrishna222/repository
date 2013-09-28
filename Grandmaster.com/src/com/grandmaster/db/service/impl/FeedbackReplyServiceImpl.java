package com.grandmaster.db.service.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import com.grandmaster.db.connection.DBConnector;
import com.grandmaster.db.entity.FeedbackReply;
import com.grandmaster.db.service.FeedbackReplyService;

public class FeedbackReplyServiceImpl implements FeedbackReplyService {

    private DBConnector connector;

    public FeedbackReplyServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public Object save(Object entity) {
        connector.createConnection();

        try {

            FeedbackReply reply = (FeedbackReply) entity;
            PreparedStatement pstmt = connector.getConnection().prepareStatement(FeedbackReply.INSERT_SQL_QUERY_V,
                    Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, reply.getFeedbackId());
            pstmt.setInt(2, reply.getRepliedByUser());
            pstmt.setString(3, reply.getResponse());
            pstmt.setTimestamp(4, new Timestamp((System.currentTimeMillis() * 1000) / 1000));
            pstmt.setTimestamp(5, new Timestamp((System.currentTimeMillis() * 1000) / 1000));

            int numOfRowsAffected = pstmt.executeUpdate();

            if (numOfRowsAffected > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();

                if (rs != null && rs.next()) {
                    reply.setId(rs.getInt(1));
                    return reply;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            connector.closeConnection();
        }
    }

    @Override
    public Object update(Object entity, int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object select(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Object> findAll(Integer start, Integer count) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    private static FeedbackReply parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            FeedbackReply feedbackReply = new FeedbackReply();

            // TODO Write Log messages

            feedbackReply.setFeedbackId(set.getInt("feedback_id"));
            feedbackReply.setRepliedByUser(set.getInt("replied_by"));
            feedbackReply.setResponse(set.getString("reply_message"));
            feedbackReply.setTimeOfReply(set.getTimestamp("time_of_reply"));
            feedbackReply.setModificationTime(set.getTimestamp("modification_time"));

            return feedbackReply;
        }
        return null;
    }

}
