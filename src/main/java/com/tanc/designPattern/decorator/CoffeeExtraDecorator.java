package com.tanc.designPattern.decorator;

/**
 * 装饰者模式：装饰者基类
 */
public abstract class CoffeeExtraDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeExtraDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
