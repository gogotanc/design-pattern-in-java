package com.tanc.designpattern.entitty;

import com.tanc.designpattern.entity.Product;
import com.tanc.designpattern.entity.SimpleFactory;
import org.junit.Test;

/**
 * 简单工厂模式测试类
 * Created by tanc on 16/9/2.
 */
public class SimpleFactoryTest {

    @Test
    public void simpleTest() {
        Product productA = SimpleFactory.createProduct("a");
        Product productB = SimpleFactory.createProduct("b");
        productA.show();
        productA.diff();

        productB.show();
        productB.diff();
    }
}
