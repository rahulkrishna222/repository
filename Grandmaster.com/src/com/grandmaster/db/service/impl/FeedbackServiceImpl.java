package com.grandmaster.db.service.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.grandmaster.db.connection.DBConnector;
import com.grandmaster.db.entity.Feedback;
import com.grandmaster.db.service.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService {

    private Log         logger = LogFactory.getLog(FeedbackServiceImpl.class);

    private DBConnector connector;

    public FeedbackServiceImpl() {
        connector = new DBConnector();
    }

    @Override
    public Object save(Object feedbackEntity) {

        // TODO Write Log messages

        connector.createConnection();

        Feedback feedback = (Feedback) feedbackEntity;

        PreparedStatement prepStmt;
        try {
            // (id,email,name,subject,message,status,creation_time)
            prepStmt = connector.getConnection().prepareStatement(Feedback.INSERT_SQL_QUERY_V);

            prepStmt.setString(1, feedback.getEmail());
            prepStmt.setString(2, feedback.getName());
            prepStmt.setString(3, feedback.getSubject());
            prepStmt.setString(4, feedback.getMessage());
            prepStmt.setObject(5, 'N');
            prepStmt.setTimestamp(6, new Timestamp((System.currentTimeMillis() / 1000) * 1000));

            ResultSet feedbackResultSet = prepStmt.executeQuery();

            if (feedbackResultSet != null) {
                feedback = parseResultSet(feedbackResultSet);
            }
            prepStmt.close();

            return feedback;
        } catch (SQLException e) {
            // TODO Write Log messages
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();
        }

        return null;
    }

    @Override
    public Object update(Object feedbackEntity, int id) {
        // TODO Write Log messages
        connector.createConnection();

        Feedback feedback = (Feedback) feedbackEntity;

        PreparedStatement prepStmt;
        try {
            // (id,email,name,subject,message,status,creation_time)
            String query = Feedback.UPDATE_SQL_QUERY;

            prepStmt = connector.getConnection().prepareStatement(Feedback.INSERT_SQL_QUERY_V);

            query += " name = ?";
            query += " email = ?";
            query += " subject = ?";
            query += " message =?";
            query += " status = ?";

            query += "where id = ?";

            prepStmt.setString(0, feedback.getName());
            prepStmt.setString(1, feedback.getEmail());
            prepStmt.setString(2, feedback.getSubject());
            prepStmt.setString(3, feedback.getMessage());
            prepStmt.setObject(4, feedback.getStatus());

            ResultSet feedbackResultSet = prepStmt.executeQuery();

            if (feedbackResultSet != null) {
                feedback = parseResultSet(feedbackResultSet);
            }
            prepStmt.close();

            return feedback;
        } catch (SQLException e) {
            // TODO Write Log messages
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();
        }

        return null;
    }

    @Override
    public Integer delete(int id) {
        try {
            // TODO Write Log messages

            connector.createConnection();
            Statement stmt = connector.getConnection().createStatement();

            String deleteQuery = Feedback.DELETE_SQL_QUERY + id;

            if (stmt.execute(deleteQuery)) {
                // TODO return a message that the feedback entry deleted
            } else {
                // TODO return a message that the feedback entry deleted
            }

        } catch (Exception e) {

        } finally {
            connector.closeConnection();
        }
        return null;
    }

    @Override
    public Feedback select(Integer id) {

        try {
            connector.createConnection();
            String selectQuery = "SELECT * FROM " + Feedback.FEEDBACK_TBL_NAME + " where id = ?";

            PreparedStatement prepStmt = connector.getConnection().prepareStatement(selectQuery);
            prepStmt.setInt(0, id);

            ResultSet resultSet = prepStmt.executeQuery();

            Feedback feedback = null;

            if (resultSet != null) {
                feedback = parseResultSet(resultSet);
            }
            return feedback;

        } catch (Exception e) {
            // TODO Write Log messages
            e.printStackTrace();
            // TODO write proper exception handling codes
        } finally {
            // TODO Write Log messages
        }

        return null;
        // TODO Auto-generated method stub
    }

    @Override
    public List<Object> findAll(Integer start, Integer count) {
        // Creating connection

        // TODO Write Log messages
        connector.createConnection();

        PreparedStatement prepStmt;
        try {
            prepStmt = connector.getConnection().prepareStatement("SELECT * from feedback");
            /*
             * Will set later
             * prepStmt.setInt(0, start);
             * prepStmt.setInt(1, count);
             */
            ResultSet feedbackResultSet = prepStmt.executeQuery();
            if (feedbackResultSet != null) {
                List<Object> feedbackList = new ArrayList<>();
                while (feedbackResultSet.next()) {
                    Feedback feedback = parseResultSet(feedbackResultSet);
                    feedbackList.add(feedback);
                }
                prepStmt.close();

                return feedbackList;
            }
        } catch (SQLException e) {
            // TODO Add logger for messaging , Also add proper exception handle
            e.printStackTrace();
        } finally {
            // TODO Write Log messages
            connector.closeConnection();

        }

        return null;
    }

    private static Feedback parseResultSet(ResultSet set) throws SQLException {
        if (set != null) {
            Feedback feedback = new Feedback();

            // TODO Write Log messages

            feedback.setId(set.getInt("id"));
            feedback.setName(set.getString("name"));
            feedback.setEmail(set.getString("email"));
            if (set.getString("status") != null) {
                feedback.setStatus(set.getString("status").charAt(0));
            }
            feedback.setSubject(set.getString("subject"));
            feedback.setMessage(set.getString("message"));
            feedback.setCreationTime(set.getTimestamp("creation_time"));

            return feedback;
        }
        return null;
    }
}
