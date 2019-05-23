package com.example.springboot.pattern;

public class Singleton {

    private Singleton(){

    }

    private static final Singleton SINGLETON =new Singleton();

    /**
     * 饿汉式（内存浪费）
     */
    public static Singleton getInstance(){
        return SINGLETON;
    }

    private static Singleton singleton1;

    /**
     * 懒汉式（线程不安全）
     * @return
     */
    public static Singleton getInstance2(){
        if (singleton1==null){
            singleton1=new Singleton();
        }
        return singleton1;
    }
    private static class SingletonInstance{

        private static final Singleton INSTANCE =new Singleton();
    }

    /**
     *线程安全（静态内部类）
     * @return
     */
    public static Singleton getInstance3(){
        return SingletonInstance.INSTANCE;
    }

    private static volatile Singleton singleton2;

    /**
     * 线程安全（双重检查）
     * @return
     */
    public static Singleton getInstance4(){
        if (singleton2==null){
            synchronized (Singleton.class){
                if(singleton2==null){
                    singleton2=new Singleton();
                }
            }
        }
        return singleton2;
    }
}
