package com.example.springboot;

import org.junit.Test;

import java.util.*;

public class HashMapTest {

    @Test
    public void hashMapTest(){
        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("1","1");
        hashmap.put("2","1");
        hashmap.put("3","1");
        hashmap.get("1");
        hashmap.remove("3");
//        Iterator<Map.Entry<String,String>> iterator= hashmap.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry entry=iterator.next();
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//        }
        for (Map.Entry<String,String> entry : hashmap.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    @Test
    public void arrayListTest(){
        List<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println(arrayList.toString());
    }
}
