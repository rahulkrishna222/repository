package com.grandmaster.db;

public interface DBOperation {

    public Integer save();

    public Integer update();

    public Integer delete();

    public void select(Integer id);

}
