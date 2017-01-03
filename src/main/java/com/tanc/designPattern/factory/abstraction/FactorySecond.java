package com.tanc.designPattern.factory.abstraction;

/**
 * 二号产品工厂
 * Created by tanc on 2017/1/3.
 */
public class FactorySecond implements Factory {

    @Override
    public ProductTypeA getTypeA() {
        return new ProductSecondA();
    }

    @Override
    public ProductTypeB getTypeB() {
        return new ProductSecondB();
    }
}
