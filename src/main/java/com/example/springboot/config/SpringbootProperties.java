package com.example.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringbootProperties {
    @Value("${com.example.name}")
    private String name;
    @Value("${com.example.title}")
    private String title;
    @Value("${com.example.number}")
    private String intVal;
    @Value("${com.example.value}")
    private String valVal;
    @Value("${com.example.desc}")
    private String desc;

    public String getIntVal() {
        return intVal;
    }

    public void setIntVal(String intVal) {
        this.intVal = intVal;
    }

    public String getValVal() {
        return valVal;
    }

    public void setValVal(String valVal) {
        this.valVal = valVal;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
