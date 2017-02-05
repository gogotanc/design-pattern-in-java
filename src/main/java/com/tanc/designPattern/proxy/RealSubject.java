package com.tanc.designPattern.proxy;

/**
 * 代理模式：真实对象类
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("我是真实的对象");
    }
}
