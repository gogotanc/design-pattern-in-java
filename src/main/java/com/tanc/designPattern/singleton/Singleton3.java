package com.tanc.designPattern.singleton;

/**
 * double-check locking
 * Created by tanc on 2017/1/3.
 */
public class Singleton3 {

    private volatile static Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (null == instance) {
            synchronized (Singleton3.class) {
                if (null == instance) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
