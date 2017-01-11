package com.tanc.designPattern.template;

/**
 * 模板方法模式：基类
 * Created by tanc on 2017/1/11.
 */
public abstract class BaseClass {

    final void templateMethod() {
        init();
        firstMethod();
        secondMethod();
        if (hook()) {
            thirdMethod();
        }
    }

    final void init() {
        System.out.println("init");
    }

    abstract void firstMethod();

    abstract void secondMethod();

    abstract void thirdMethod();

    boolean hook() {
        return true;
    }
}
