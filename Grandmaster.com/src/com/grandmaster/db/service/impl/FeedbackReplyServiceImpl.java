package com.grandmaster.db.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.grandmaster.db.entity.FeedbackReply;
import com.grandmaster.db.service.FeedbackReplyService;

public class FeedbackReplyServiceImpl implements FeedbackReplyService {

    @Override
    public Object save(Object entity) {
        // TODO Auto-generated method stub
        return null;
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
