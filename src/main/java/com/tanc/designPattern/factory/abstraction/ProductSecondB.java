package com.tanc.designPattern.factory.abstraction;

/**
 * 二号工厂生产的 B 类型产品
 * Created by tanc on 2017/1/3.
 */
public class ProductSecondB implements ProductTypeB {

    @Override
    public void methodC() {
        System.out.println("二号工厂 - B 产品 - methodC()");
    }

    @Override
    public void methodD() {
        System.out.println("二号工厂 - B 产品 - methodD()");
    }
}
