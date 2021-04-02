package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.AbstractRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@Repository
public class JdbcRepositoryImpl  {

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public JdbcRepositoryImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public static final String INSERT_SQL = "insert into user (firstName, lastName, email) values (?, ?, ?)";
//    public static final String SELECT_ALL_SQL = "select * from user";
//
//    @Override
//    public List<User> getAll() {
//        List<User> userList = jdbcTemplate.query(SELECT_ALL_SQL, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
//                return new User(resultSet.getInt("id"),
//                        resultSet.getString("firstName"),
//                        resultSet.getString("lastName"),
//                        resultSet.getString("email"));
//            }
//        });
//        return userList;
//    }
//
//    @Override
//    public void create(User user) {
//        jdbcTemplate.update(INSERT_SQL, user.getFirstName(), user.getLastName(), user.getEmail());
//
//        log.info("User " + user.getFirstName() + " " + user.getLastName() + " added");
//    }
}
