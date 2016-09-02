package com.tanc.designPattern.factoryMethod;

/**
 * 具体工厂B 生产B商品
 * Created by tanc on 16/9/2.
 */
public class GoodsBFactory implements Factory {

    public Goods createGoods() {
        return new GoodsImplB();
    }
}
