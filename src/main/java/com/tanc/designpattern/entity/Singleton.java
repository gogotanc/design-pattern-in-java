package com.tanc.designpattern.entity;

/**
 * 单例模式 : 饿汉式
 * 特点 : 线程安全
 * Created by tanc on 16/9/2.
 */
public class Singleton {

    // 1.私有化构造函数
    private Singleton() {}

    // 2.实例化对象
    private static Singleton instance = new Singleton();

    // 通过方法获取实例
    public static Singleton getInstance() {
        return instance;
    }
}
