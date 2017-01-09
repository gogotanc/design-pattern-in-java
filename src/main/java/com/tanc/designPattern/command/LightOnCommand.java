package com.tanc.designPattern.command;

/**
 * 命令模式：开电灯泡的命令
 * Created by tanc on 2017/1/9.
 */
public class LightOnCommand implements Command {

    private Receive light;

    public LightOnCommand(Receive receive) {
        this.light = receive;
    }

    @Override
    public void execute() {
        light.on();
    }
}
