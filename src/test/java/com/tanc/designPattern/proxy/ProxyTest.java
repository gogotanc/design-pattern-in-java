package com.tanc.designPattern.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 代理模式测试类
 */
public class ProxyTest {

    @Test
    public void run() throws Exception {

        Subject subject = new SubjectProxy();

        subject.request();

        Thread.sleep(1000);

        subject.request();
    }

}