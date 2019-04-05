package com.arun.springjdbcvsjpawithhibernate.jdbcTemplateDao;

import com.arun.springjdbcvsjpawithhibernate.model.Cricket;

import java.util.List;

public interface CricketDao {

    List<Cricket> getAllCricketers();
}
