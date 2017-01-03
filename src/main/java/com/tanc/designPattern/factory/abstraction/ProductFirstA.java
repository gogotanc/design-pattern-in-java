package com.tanc.designPattern.factory.abstraction;

/**
 * 一号工厂生产的 A 类型产品
 * Created by tanc on 2017/1/3.
 */
public class ProductFirstA implements ProductTypeA {

    @Override
    public void methodA() {
        System.out.println("一号工厂 - A 产品 - methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("一号工厂 - A 产品 - methodB()");
    }
}
