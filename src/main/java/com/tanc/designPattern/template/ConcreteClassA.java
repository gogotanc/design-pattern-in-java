package com.tanc.designPattern.template;

/**
 * 模板方法模式：子类 A
 * Created by tanc on 2017/1/11.
 */
public class ConcreteClassA extends BaseClass {

    @Override
    void firstMethod() {
        System.out.println("Class A firstMethod");
    }

    @Override
    void secondMethod() {
        System.out.println("Class A secondMethod");
    }

    @Override
    void thirdMethod() {
        System.out.println("Class A thirdMethod");
    }
}
