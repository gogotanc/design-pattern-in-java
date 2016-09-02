package com.tanc.designpattern.entity;

/**
 * 单例模式 : 懒汉式
 * 特点 : 线程不安全
 * Created by tanc on 16/9/2.
 */
public class Singleton2 {

    private Singleton2() {}

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
