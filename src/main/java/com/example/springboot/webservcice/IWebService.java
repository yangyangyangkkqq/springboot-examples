package com.example.springboot.webservcice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWebService {
    @WebMethod
    String sayHello(String name);
}
