package com.tanc.designPattern.command;

/**
 * 命令模式：电灯泡（接收者）
 * Created by tanc on 2017/1/9.
 */
public class Light implements Receive {

    @Override
    public void on() {
        System.out.println("light on");
    }

    @Override
    public void off() {
        System.out.println("light off");
    }
}
