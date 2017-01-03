package com.tanc.designPattern.singleton;

/**
 * 通过 idea 创建的单例模式对象，使用的是懒汉式。
 * Created by tanc on 2017/1/3.
 */
public class Singleton4 {

    private static Singleton4 ourInstance = new Singleton4();

    public static Singleton4 getInstance() {
        return ourInstance;
    }

    private Singleton4() {
    }
}
