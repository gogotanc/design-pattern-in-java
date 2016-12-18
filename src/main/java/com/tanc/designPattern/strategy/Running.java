package com.tanc.designPattern.strategy;

/**
 * 跑步
 *
 * @author tanc
 */
public class Running implements Behaviour {

    @Override
    public void start() {
        System.out.println("开始跑步");
    }

    @Override
    public void stop() {
        System.out.println("停止跑步");
    }
}
