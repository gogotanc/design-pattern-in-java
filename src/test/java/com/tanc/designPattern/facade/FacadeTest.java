package com.tanc.designPattern.facade;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 外观模式测试类
 * Created by tanc on 2017/1/10.
 */
public class FacadeTest {

    @Test
    public void play() throws Exception {

        Cinema cinema = new Cinema();

        cinema.play();

        cinema.end();
    }

}