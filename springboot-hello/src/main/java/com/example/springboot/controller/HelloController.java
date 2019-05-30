package com.example.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "测试",tags = "HelloController")
@RestController
@RequestMapping("/test")
public class HelloController {

    @ApiOperation(value = "HELLO")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test(){
        return "hello world";
    }

}
