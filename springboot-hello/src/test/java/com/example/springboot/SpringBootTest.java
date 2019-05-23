package com.example.springboot;

import com.example.springboot.config.SpringbootProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@org.springframework.boot.test.context.SpringBootTest
public class SpringBootTest {
    @Autowired
    private SpringbootProperties properties;

    @Test
    public void proTest(){
        System.out.println(properties.getName()+":"+properties.getTitle()+":"+properties.getDesc()+":"+properties.getIntVal()+":"+properties.getValVal());

    }
}
