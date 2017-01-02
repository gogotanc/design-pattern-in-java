package com.tanc.designPattern.decorator;

/**
 * 装饰者模式：bubble 装饰者.
 *
 * 加一份 bubble 9元
 */
public class BubbleDecorator extends CoffeeExtraDecorator {

    public BubbleDecorator(Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return this.coffee.cost() + 9.0;
    }
}
