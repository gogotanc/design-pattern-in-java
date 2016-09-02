package com.tanc.designPattern.factoryMethod;

/**
 * 具体工厂A 生产A商品
 * Created by tanc on 16/9/2.
 */
public class GoodsAFactory implements Factory {

    public Goods createGoods() {
        return new GoodsImplA();
    }
}
