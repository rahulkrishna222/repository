package com.grandmaster.db;

import java.sql.SQLException;
import java.util.List;

import com.grandmaster.db.entity.Feedback;

public interface DBOperation {

    public <T> T save(Object entity);

    public <T> T update(Object entity, int id);

    public Integer delete(int id);

    public <T> T select(Integer id);

    public List<Object> findAll(Integer start, Integer count) throws SQLException;

}
