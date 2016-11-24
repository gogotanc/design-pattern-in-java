package com.tanc.designPattern.observer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 观察者模式（监听器模式）测试类
 * Created by tanc on 2016/11/24.
 */
public class ObserverTest {

    @Test
    public void firstTest() throws Exception {

        Subject subject = new ConcreteSubject();

        subject.addObserver(() -> System.out.println("收到消息。"));

        subject.notifyObserver();
    }

    @Test
    public void secondTest() {

        Subject subject = new BlogSubject();

        Reader zhang = new Reader("小张");
        Reader wang = new Reader("小王");

        subject.addObserver(zhang);
        subject.addObserver(wang);

        subject.notifyObserver();

        subject.removeObserver(zhang);

        subject.notifyObserver();

    }
}