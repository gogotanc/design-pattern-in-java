package com.tanc.designPattern.singleton;

/**
 * 单例模式：懒汉式，变种
 * Created by tanc on 2017/1/3.
 */
public class Singleton3 {

    private Singleton3() {}

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if (null == instance) {
            instance = new Singleton3();
        }
        return instance;
    }
}
