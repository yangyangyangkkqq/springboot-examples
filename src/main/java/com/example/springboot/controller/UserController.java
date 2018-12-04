package com.example.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "springboot接口文档")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "转到user页面")
    @GetMapping("/toUser")
    public String User(){
        return "user";
    }
}
