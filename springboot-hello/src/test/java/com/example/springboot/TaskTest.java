package com.example.springboot;

import com.example.springboot.config.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskTest {
    @Autowired
    private Task task;
    @Autowired
    private static Logger log=LoggerFactory.getLogger(TaskTest.class);
    @Test
    public void test() throws Exception{
        long start=System.currentTimeMillis();
        Future<String> task1=task.doTaskOne();
        Future<String> task2=task.doTaskTwo();
        Future<String> task3=task.doTaskThree();
        while (true){
            if(task1.isDone()&&task2.isDone()&&task3.isDone()){
                break;
            }
//            Thread.sleep(1000);
        }
        long end=System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时："+(end-start)+"毫秒");
    }

    @Test
    public void test1() throws Exception{
        Future<String> task1=task.doTaskOne();
        Future<String> task2=task.doTaskTwo();
        Future<String> task3=task.doTaskThree();
        String result1 = task1.get(5, TimeUnit.SECONDS);
        String result2 = task2.get(5, TimeUnit.SECONDS);
        String result3 = task3.get(5, TimeUnit.SECONDS);
        log.info("任务1:"+result1+"任务2:"+result2+"任务3:"+result3);
//        Thread.currentThread().join();
    }

    @Test
    public void test2() throws Exception{
        for (int i = 0; i < 1000; i++) {
            task.doTask1();
            task.doTask2();
            if(i==999){
                System.exit(0);
            }
        }
    }
}
