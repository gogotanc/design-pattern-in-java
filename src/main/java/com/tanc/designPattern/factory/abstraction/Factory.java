package com.tanc.designPattern.factory.abstraction;

/**
 * 抽象工厂模式
 * Created by tanc on 2017/1/3.
 */
public interface Factory {

    ProductTypeA getTypeA();

    ProductTypeB getTypeB();
}
