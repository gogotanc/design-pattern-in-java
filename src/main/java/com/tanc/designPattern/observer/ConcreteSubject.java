package com.tanc.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式 被观察者的一个实现
 * Created by tanc on 2016/11/24.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(Observer::update);
    }
}
