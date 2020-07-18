package com.example.springboot;

import com.example.springboot.config.SpringUtils;
import com.example.springboot.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.connection.RedisServer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.spring5.context.SpringContextUtils;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void redis(){
        redisTemplate.opsForValue().set("key1","value1");
//        System.out.println(redisTemplate.opsForValue().get("key1"));
//
//        User user = new User("超人", 20);
//        redisTemplate.opsForValue().set(user.getName(), user);
//        System.out.println(redisTemplate.opsForValue().get("超人"));

        redisTemplate.opsForValue().set("lockKey", 1, 10,TimeUnit.SECONDS);
        System.out.println(redisTemplate.opsForValue().get("lockKey"));

    }
}
