package com.tanc.designPattern.singleton;

/**
 * 单例模式：双重校验锁
 * Created by tanc on 2017/3/11.
 */
public class Singleton4 {

    private Singleton4() {}

    private volatile static Singleton4 instance;

    public static Singleton4 getInstance() {
        if (null == instance) {
            synchronized (Singleton4.class) {
                if (null == instance) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
