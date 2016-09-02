package com.tanc.designPattern.factoryMethod;

import org.junit.Test;

/**
 * 工厂方法测试类
 * Created by tanc on 16/9/2.
 */
public class FactoryMethodTest {

    private Factory factory;
    private Goods goods;

    @Test
    public void createA() {
        factory = new GoodsAFactory();
        goods = factory.createGoods();
        goods.show();
    }

    @Test
    public void createB() {
        factory = new GoodsBFactory();
        goods = factory.createGoods();
        goods.show();
    }
}
