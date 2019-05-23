package com.example.springboot;

import org.junit.Test;

public class ThreadTest {

    @Test
    public void test() throws InterruptedException {
        boolean flag=true;

       Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if ((i%2)==0){
                        System.out.println(i);
                    }
                }
            }
        };
       Thread t1=new Thread(runnable);
       Runnable runnable2=new Runnable() {
        @Override
        public void run() {
        for (int i=0;i<=100;i++){
            if ((i%2)==1){
                System.out.println(i);
            }
        }
        }
        };
        Thread t2=new Thread(runnable2);

        t1.start();
        t2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if ((i%2)==0){
                        System.out.println(Thread.currentThread().getName()+"==="+i);
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t1=new Thread(runnable);
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if ((i%2)==1){
                        System.out.println(Thread.currentThread().getName()+"==="+i);
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2=new Thread(runnable2);
//        t1.join();
//        t2.join();
        t1.start();
        t2.start();
    }
}
