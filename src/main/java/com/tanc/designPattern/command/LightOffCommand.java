package com.tanc.designPattern.command;

/**
 * 命令模式：关电灯泡的命令
 * Created by tanc on 2017/1/9.
 */
public class LightOffCommand implements Command {

    private Receive light;

    public LightOffCommand(Receive receive) {
        this.light = receive;
    }

    @Override
    public void execute() {
        light.off();
    }
}
