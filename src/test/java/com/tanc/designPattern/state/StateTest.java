package com.tanc.designPattern.state;

import org.junit.Test;

/**
 * 状态模式测试类
 * Created by tanc on 2017/1/12.
 */
public class StateTest {

    @Test
    public void tackCash() throws Exception {
        ATMMachine machine = new ATMMachine(1000);

        machine.request(300);
        machine.request(300);
        machine.request(500);
    }

}