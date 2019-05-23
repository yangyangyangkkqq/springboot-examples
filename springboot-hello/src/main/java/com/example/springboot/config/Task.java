package com.example.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * 异步调用任务
 */
@Component
public class Task {

    @Autowired
    private StringRedisTemplate redisTemplate;

    private static Logger log = LoggerFactory.getLogger(Task.class);
    public static Random random = new Random();

    @Async("taskExecutor")
    public Future<String> doTaskOne() throws Exception {
        log.info("开始做任务1");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        log.info("完成任务1，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务1完成");
    }

    @Async("taskExecutor")
    public Future<String> doTaskTwo() throws Exception {
        log.info("开始做任务2");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        log.info("完成任务2，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务2完成");
    }

    @Async("taskExecutor")
    public Future<String> doTaskThree() throws Exception {
        log.info("开始做任务3");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(1000));
        long end = System.currentTimeMillis();
        log.info("完成任务3，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务3完成");
    }

    @Async("taskExecutor")
    public Future<String> doTask1() throws Exception {
        log.info("开始做任务一");
        long start = System.currentTimeMillis();
        log.info(redisTemplate.randomKey());
        long end = System.currentTimeMillis();
        log.info("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一完成");
    }

    @Async("taskExecutor")
    public Future<String> doTask2() throws Exception {
        log.info("开始做任务二");
        long start = System.currentTimeMillis();
        log.info(redisTemplate.randomKey());
        long end = System.currentTimeMillis();
        log.info("完成任务二，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务二完成");
    }
}
