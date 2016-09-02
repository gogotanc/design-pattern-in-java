package com.tanc.designpattern.entity;

/**
 * 简单工厂模式
 * Created by tanc on 16/9/2.
 */
public class SimpleFactory {

    public static Product createProduct(String name) {

        Product product = null;

        if (name.equals("a")) {
            product = new ProductA();
        } else if (name.equals("b")) {
            product = new ProductB();
        }

        return product;
    }
}
