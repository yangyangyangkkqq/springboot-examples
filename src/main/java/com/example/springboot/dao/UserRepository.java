package com.example.springboot.dao;

import com.example.springboot.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
@CacheConfig(cacheNames = "users")
public interface UserRepository extends JpaRepository<User,String> {
    User findByNameAndAge(String name, Integer age);
    @Cacheable(key = "#p0")
    User findByName(String name);
    @CachePut(key = "#p0.name")
    @Override
    User save(User user);
}
