package com.tanc.designPattern.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 装饰者模式测试类
 */
public class CoffeeTest {

    @Test
    public void cost() throws Exception {

        Coffee coffee = new Mocha();
        CoffeeExtraDecorator decorator = new BubbleDecorator(coffee);
        decorator = new MilkDecorator(decorator);
        assertEquals(31.0, decorator.cost(), 0);
    }

    @Test
    public void demo() {
        Coffee coffee = new Mocha();
        CoffeeExtraDecorator decorator = new BubbleDecorator(coffee);
        decorator = new BubbleDecorator(decorator);
        decorator = new MilkDecorator(decorator);
        assertEquals(40.0, decorator.cost(), 0);
    }
}