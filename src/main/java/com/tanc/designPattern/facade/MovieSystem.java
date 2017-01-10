package com.tanc.designPattern.facade;

/**
 * 外观模式：影像子系统
 * Created by tanc on 2017/1/10.
 */
public class MovieSystem {

    public void show() {
        System.out.println("影像系统：投影开始。");
    }

    public void off() {
        System.out.println("影像系统：投影结束。");
    }
}
