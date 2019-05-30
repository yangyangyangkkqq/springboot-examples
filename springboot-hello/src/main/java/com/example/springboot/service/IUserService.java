package com.example.springboot.service;

/**
 * user jdbcTemplate实例
 */
public interface IUserService {

    /**
     * 获取所有用户
     * @return
     */
    Integer getAllUser();

    /**
     * 根据用户名删除用户
     * @param name
     * @return
     */
    void deleteByName(String name);

    /**
     * 新增用户
     * @param user
     */
    void insertUser(Long id,String name,Integer age);

    void deleteUser();

}
