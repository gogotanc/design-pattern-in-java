package com.tanc.designPattern.decorator;

/**
 * 装饰者模式：具体组件一
 *
 * 一杯 mocha 原价10元
 */
public class Mocha implements Coffee {

    public double cost() {
        return 10.0;
    }
}
