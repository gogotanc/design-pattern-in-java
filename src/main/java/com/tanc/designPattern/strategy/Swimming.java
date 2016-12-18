package com.tanc.designPattern.strategy;

/**
 * 游泳
 *
 * @author tanc
 */
public class Swimming implements Behaviour {

    @Override
    public void start() {
        System.out.println("开始游泳。");
    }

    @Override
    public void stop() {
        System.out.println("结束游泳。");
    }
}
