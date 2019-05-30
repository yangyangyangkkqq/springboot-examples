package com.example.springboot;

import org.junit.Test;

/**
 * 对象的引用
 */
public class Object {


    @Test
    public void strongReference(){
        Object object=new Object();
        object=null;
    }

    @Test
    public void softReference(){
        Object object=new Object();
    }
}
