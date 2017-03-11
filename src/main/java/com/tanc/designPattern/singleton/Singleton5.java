package com.tanc.designPattern.singleton;

/**
 * 单例模式：静态内部类实现
 * Created by tanc on 2017/1/3.
 */
public class Singleton5 {

    private Singleton5() {}

    public static Singleton5 getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
}
