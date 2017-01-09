package com.tanc.designPattern.command;

/**
 * 命令模式：调用者类
 * Created by tanc on 2017/1/9.
 */
public class Invoker implements Invoke {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void runCommand() {
        command.execute();
    }
}
