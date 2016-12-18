package com.tanc.designPattern.strategy;

import org.junit.Test;

/**
 * 策略模式测试类
 *
 * @author tanc
 */
public class StrategyTest {

    @Test
    public void test() throws Exception {
        Player player = new Player(new Running());
        player.play();
    }

    @Test
    public void second() throws Exception {
        Player player = new Player(new Swimming());
        player.play();
        player.setBehaviour(new Running());
        player.play();
    }

}