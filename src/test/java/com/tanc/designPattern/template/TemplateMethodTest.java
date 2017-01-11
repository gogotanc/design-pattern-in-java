package com.tanc.designPattern.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 模板方法模式测试类
 * Created by tanc on 2017/1/11.
 */
public class TemplateMethodTest {

    @Test
    public void templateMethod() throws Exception {

        BaseClass a = new ConcreteClassA();
        a.templateMethod();

        BaseClass b = new ConcreteClassB();
        b.templateMethod();
    }

}