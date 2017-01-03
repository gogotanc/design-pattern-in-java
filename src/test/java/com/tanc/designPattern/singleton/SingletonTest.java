package com.tanc.designPattern.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 单例模式测试类
 * Created by tanc on 16/9/2.
 */
public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertEquals(true, singleton == singleton2);
    }

    @Test
    public void singletonTest2() {
        Singleton2 singleton = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        assertEquals(true, singleton == singleton2);
    }

    @Test
    public void sinletonTest3() {
        Singleton3 singleton = Singleton3.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();

        assertEquals(true, singleton == singleton3);
    }
}
