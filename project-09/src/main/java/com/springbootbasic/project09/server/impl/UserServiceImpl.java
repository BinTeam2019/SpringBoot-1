package com.springbootbasic.project09.server.impl;

import com.springbootbasic.project09.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age,String address,String pwd) {
        jdbcTemplate.update("insert into USER(name, age, address, pwd) " +
                "values(?, ?, ?, ?)",
                name,
                age,
                address,
                pwd
        );
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from USER where NAME = ?", name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(id) as COUNTID from USER", Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("delete from USER");
    }
}
