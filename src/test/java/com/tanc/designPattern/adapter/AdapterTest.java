package com.tanc.designPattern.adapter;

import org.junit.Test;

/**
 * 适配器模式测试类
 * Created by tanc on 2017/1/10.
 */
public class AdapterTest {

    @Test
    public void test() {

        NewInterface in = new Adapter(new OldInterface() {
            @Override
            public void oldShow() {
                System.out.println("old interface show().");
            }

            @Override
            public void oldRun() {
                System.out.println("old interface run().");
            }
        });

        // 客户调用新接口的 show 和 run
        in.showAndRun();
    }
}