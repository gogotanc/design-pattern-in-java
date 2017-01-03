package com.tanc.designPattern.factory.abstraction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 抽象工厂测试类
 * Created by tanc on 2017/1/3.
 */
public class FactoryTest {

    @Test
    public void first() throws Exception {

        // 使用一号工厂生产的 A、B 类产品

        Factory factory = new FactoryFirst();
        ProductTypeA a = factory.getTypeA();
        ProductTypeB b = factory.getTypeB();

        a.methodA();
        a.methodB();
        b.methodC();
        b.methodD();
    }

    @Test
    public void second() throws Exception {

        // 使用二号工厂生产的 A、B 类产品

        Factory factory = new FactorySecond();
        ProductTypeA a = factory.getTypeA();
        ProductTypeB b = factory.getTypeB();

        a.methodA();
        a.methodB();
        b.methodC();
        b.methodD();

        /*
         * 使用抽象工厂模式，
         * 如果需要添加一个新的工厂（三号工厂），以及三号工厂生产的 A、B 型产品，扩展是很方便的。
         * 但是如果需要添加一个新的类型 C，每个工厂还需要生产 C 类产品，扩展将会很麻烦。
         */
    }

}