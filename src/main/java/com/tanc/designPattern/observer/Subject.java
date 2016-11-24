package com.tanc.designPattern.observer;

/**
 * 观察者模式 主题（被观察者）
 * Created by tanc on 2016/11/24.
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
