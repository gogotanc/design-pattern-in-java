package com.tanc.designpattern.entitty;

import com.tanc.designpattern.entity.Singleton;
import com.tanc.designpattern.entity.Singleton2;
import org.junit.Test;

import static org.junit.Assert.*;

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
}
