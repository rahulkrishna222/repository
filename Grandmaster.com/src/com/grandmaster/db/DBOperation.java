package com.grandmaster.db;

import java.sql.SQLException;
import java.util.List;

import com.grandmaster.db.entity.Feedback;

public interface DBOperation {

    public Object save(Object entity);

    public Object update(Object entity, int id);

    public Integer delete(int id);

    public Object select(Integer id);

    public List<Object> findAll(Integer start, Integer count) throws SQLException;

}
