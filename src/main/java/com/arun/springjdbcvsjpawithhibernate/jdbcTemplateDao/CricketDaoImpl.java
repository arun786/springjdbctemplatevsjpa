package com.arun.springjdbcvsjpawithhibernate.jdbcTemplateDao;

import com.arun.springjdbcvsjpawithhibernate.model.Cricket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CricketDaoImpl implements CricketDao {

    @Qualifier("mySqlNamedParameterJdbcTemplate")
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Autowired
    public CricketDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<Cricket> getAllCricketers() {

        SqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();


        return namedParameterJdbcTemplate.query(mySQLConstants.mySQLGetAllCricketers, mapSqlParameterSource, (rs, n) -> {
            Cricket cricket = new Cricket();
            cricket.setName(rs.getString("name"));
            cricket.setCountry(rs.getString("country"));
            cricket.setScore(rs.getInt("score"));
            cricket.setMatches(rs.getInt("nomatches"));
            cricket.setAverage(rs.getDouble("average"));
            return cricket;
        });
    }
}
