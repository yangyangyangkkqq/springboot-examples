package com.example.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务实例
 */
@Api(description = "服务实例",tags = "DcController")
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;

    @ApiOperation(value = "打印服务实例")
    @GetMapping("/dc")
    public String dc(){
        String services="services:"+discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
