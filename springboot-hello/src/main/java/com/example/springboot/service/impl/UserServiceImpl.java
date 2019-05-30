package com.example.springboot.service.impl;

import com.example.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getAllUser() {
        return jdbcTemplate.queryForObject("select COUNT(1) from User ", Integer.class);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from User where name=?",name);
    }

    @Override
    public void insertUser(Long id,String name,Integer age) {
        jdbcTemplate.update("insert into User(id,name,age) values (?,?,?)",id,name,age);
    }

    @Override
    public void deleteUser() {
        jdbcTemplate.update("delete from User");
    }
}
