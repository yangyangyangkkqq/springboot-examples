package com.example.springboot.webservcice;

import javax.jws.WebService;

@WebService
public class WebServiceImpl implements IWebService{
    @Override
    public String sayHello(String name) {
        String result="你好，我名字是："+name;
        System.out.println("接收到客户端请求："+name);
        return result;
    }
}
