package com.tanc.designPattern.builder;

/**
 * 建造者模式：builder 基类
 * Created by tanc on 2017/4/12.
 */
public interface Builder {

    void buildName(String name);

    void buildType(String type);

    void buildDesc(String desc);

    void buildPrice(int price);

    Product create();
}
