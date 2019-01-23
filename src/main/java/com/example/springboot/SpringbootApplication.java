package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@EnableScheduling
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @EnableAsync
    @Configuration
    class TaskPoolConfig{
        @Bean("taskExecutor")
       public Executor taskExecutor(){
           ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
           executor.setCorePoolSize(10);
           executor.setMaxPoolSize(20);
           executor.setQueueCapacity(200);
           executor.setKeepAliveSeconds(60);
           executor.setThreadNamePrefix("taskExecutor-");
           executor.setWaitForTasksToCompleteOnShutdown(true);
           executor.setAwaitTerminationSeconds(60);
           executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
           return executor;
       }

    }
}
