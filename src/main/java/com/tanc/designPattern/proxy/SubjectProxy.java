package com.tanc.designPattern.proxy;

/**
 * 代理模式：代理类
 */
public class SubjectProxy implements Subject {

    Subject subject;

    boolean flag;

    public SubjectProxy() {
        this.flag = false;
    }

    @Override
    public void request() {
        if (!this.flag) {
            this.flag = true;
            System.out.println("我是代理对象，真的对象正在来的路上。");
            new Thread(() -> {
                subject = new RealSubject();
                subject.request();
            }).start();
        } else {
            subject.request();
        }
    }
}
