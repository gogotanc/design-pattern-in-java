package com.tanc.designPattern.builder;

/**
 * 建造者模式：实际的建造者
 * Created by tanc on 2017/4/12.
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildName(String name) {
        product.setName(name);
    }

    @Override
    public void buildType(String type) {
        product.setType(type);
    }

    @Override
    public void buildDesc(String desc) {
        product.setDesc(desc);
    }

    @Override
    public void buildPrice(int price) {
        product.setPrice(price);
    }

    @Override
    public Product create() {
        return this.product;
    }
}
