package com.tanc.designPattern.factory.simple;

import org.junit.Test;

/**
 * 简单工厂模式测试类
 * Created by tanc on 16/9/2.
 */
public class SimpleFactoryTest {

    @Test
    public void simpleTestA() {
        Product productA = SimpleFactory.createProduct("a");
        productA.show();
        productA.diff();
    }

    @Test
    public void simpleTestB() {
        Product product = SimpleFactory.createProduct("b");
        product.show();
        product.diff();
    }
}
