package com.example.springboot;

import com.example.springboot.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJdbcTest {

    @Autowired
    private IUserService userService;

    @Test
    public void test(){
        userService.deleteUser();
        Assert.assertEquals(0,userService.getAllUser().intValue());
        userService.insertUser(1000L,"john",10);
        userService.insertUser(2000L,"tony",20);
        userService.insertUser(3000L,"jeny",30);
        userService.insertUser(4000L,"666",40);
        userService.insertUser(5000L,"777",50);
        Assert.assertEquals(5,userService.getAllUser().intValue());
        userService.deleteByName("666");
        userService.deleteByName("777");
        Assert.assertEquals(3,userService.getAllUser().intValue());
    }
}
