package com.tanc.designPattern.factory.abstraction;

/**
 * 一号产品工厂
 * Created by tanc on 2017/1/3.
 */
public class FactoryFirst implements Factory {

    @Override
    public ProductTypeA getTypeA() {
        return new ProductFirstA();
    }

    @Override
    public ProductTypeB getTypeB() {
        return new ProductFirstB();
    }
}
