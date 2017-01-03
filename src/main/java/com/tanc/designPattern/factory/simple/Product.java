package com.tanc.designPattern.factory.simple;

/**
 * 产品抽象类
 * Created by tanc on 16/9/2.
 */
public abstract class Product {

    public void show() {
        System.out.print("show");
    }

    public abstract void diff();
}
