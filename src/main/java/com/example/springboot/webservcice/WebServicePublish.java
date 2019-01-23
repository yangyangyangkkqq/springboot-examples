package com.example.springboot.webservcice;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    public static void main(String[] args) {
        String address="http://localhost:8989/webservice";
        Endpoint.publish(address,new WebServiceImpl());
        System.out.println("发布webservice成功！");
    }
}
