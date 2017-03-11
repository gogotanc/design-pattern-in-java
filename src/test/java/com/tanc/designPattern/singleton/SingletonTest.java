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
    public void singletonTest3() {
        Singleton3 singleton = Singleton3.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();

        assertEquals(true, singleton == singleton3);
    }

    @Test
    public void singletonTest4() {
        Singleton4 singleton = Singleton4.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();

        assertEquals(true, singleton == singleton4);
    }

    @Test
    public void singletonTest5() {
        Singleton5 singleton = Singleton5.getInstance();
        Singleton5 singleton5 = Singleton5.getInstance();

        assertEquals(true, singleton == singleton5);
    }

    @Test
    public void singletonTest6() {
        Singleton6 singleton = Singleton6.INSTANCE;
        Singleton6 singleton6 = Singleton6.INSTANCE;

        singleton.method();
        singleton6.method();
    }
}
