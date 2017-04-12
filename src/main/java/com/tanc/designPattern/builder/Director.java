package com.tanc.designPattern.builder;

/**
 * 建造者模式：统一组装过程
 * Created by tanc on 2017/4/12.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String name, String type, String desc, int price) {
        builder.buildName(name);
        builder.buildType(type);
        builder.buildDesc(desc);
        builder.buildPrice(price);
    }
}
