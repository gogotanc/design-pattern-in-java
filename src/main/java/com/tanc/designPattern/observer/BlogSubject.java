package com.tanc.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者的另一个实现，假设是个博客，有些订阅者。
 * Created by tanc on 2016/11/24.
 */
public class BlogSubject implements Subject {

    private List<Observer> readers = new ArrayList<>();

    @Override
    public void addObserver(Observer reader) {
        System.out.println("博客: 增加了一个读者。");
        readers.add(reader);
    }

    @Override
    public void removeObserver(Observer reader) {
        System.out.println("博客: 博客内容不好，丢失一个读者啊。");
        readers.remove(reader);
    }

    @Override
    public void notifyObserver() {
        System.out.println("博客: 我是一个博客，我更新了博客。");
        readers.forEach(Observer::update);
    }
}
