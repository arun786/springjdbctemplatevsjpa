package com.arun.springjdbcvsjpawithhibernate.service;

import com.arun.springjdbcvsjpawithhibernate.jdbcTemplateDao.CricketDao;
import com.arun.springjdbcvsjpawithhibernate.model.Cricket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketServiceImpl implements CricketService {

    private CricketDao cricketDao;

    @Autowired
    public CricketServiceImpl(CricketDao cricketDao) {
        this.cricketDao = cricketDao;
    }

    @Override
    public List<Cricket> getAllCricketers() {
        return cricketDao.getAllCricketers();
    }
}
