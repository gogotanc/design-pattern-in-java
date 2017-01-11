package com.tanc.designPattern.template;

/**
 * 模板方法模式：子类 B
 * Created by tanc on 2017/1/11.
 */
public class ConcreteClassB extends BaseClass {

    @Override
    void firstMethod() {
        System.out.println("Class B firstMethod");
    }

    @Override
    void secondMethod() {
        System.out.println("Class B secondMethod");
    }

    @Override
    void thirdMethod() {
        System.out.println("Class B thirdMethod");
    }

    @Override
    boolean hook() {
        return false;
    }
}
