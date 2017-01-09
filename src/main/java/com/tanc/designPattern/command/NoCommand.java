package com.tanc.designPattern.command;

/**
 * 命令模式：空对象
 * Created by tanc on 2017/1/9.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        // do nothing
    }
}
