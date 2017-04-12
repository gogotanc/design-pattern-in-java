package com.tanc.designPattern.builder.another;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 建造者模式测试
 * Created by tanc on 2017/4/12.
 */
public class ComputerTest {

    @Test
    public void run() throws Exception {
        Computer.ConcreteBuilder builder = new Computer.ConcreteBuilder("intel", 4);
        builder.setName("tanc's MBP").setSystem("MacOS");
        Computer computer = builder.build();
        computer.run();
    }

    @Test
    public void case2() throws Exception {
        Computer computer = new Computer.ConcreteBuilder("intel", 8).setName("tanc's MacBookPro").setSystem("MacOS").build();
        computer.showMessage();
    }

    @Test
    public void case3() throws Exception {
        Computer computer = new Computer.ConcreteBuilder("intel", 4).build();
        computer.showMessage();
    }

}