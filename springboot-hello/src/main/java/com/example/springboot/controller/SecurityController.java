package com.example.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 安全控制
 */
@Api(description = "安全控制",tags = "SecurityController")
@Controller
@RequestMapping("/")
public class SecurityController {

    @ApiOperation(value = "主页")
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @ApiOperation(value = "欢迎页")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @ApiOperation(value = "登录页")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
