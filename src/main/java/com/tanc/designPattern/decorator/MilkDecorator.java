package com.tanc.designPattern.decorator;

/**
 * 装饰者模式：milk 装饰者.
 *
 * 加一份 milk 12元
 */
public class MilkDecorator extends CoffeeExtraDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return this.coffee.cost() + 12.0;
    }
}
