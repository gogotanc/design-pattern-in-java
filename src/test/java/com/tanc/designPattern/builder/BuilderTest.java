package com.tanc.designPattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 建造者模式测试类
 * Created by tanc on 2017/4/12.
 */
public class BuilderTest {

    @Test
    public void buildName() throws Exception {

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct("name", "good", "hello", 100);
        Product product = builder.create();
        System.out.println(product.getName());
    }

}