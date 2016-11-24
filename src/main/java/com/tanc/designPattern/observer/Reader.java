package com.tanc.designPattern.observer;

/**
 * 读者 作为观察者，订阅的博客更新了会去看看。
 * Created by tanc on 2016/11/24.
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": 博客更新了去看看。");
    }
}
