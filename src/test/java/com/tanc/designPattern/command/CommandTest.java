package com.tanc.designPattern.command;

import org.junit.Test;

/**
 * 命令模式测试类
 * Created by tanc on 2017/1/9.
 */
public class CommandTest {

    @Test
    public void command() throws Exception {

        Receive light = new Light();

        Command lightOnCommand = new LightOnCommand(light);

        Command lightOffCommand = new LightOffCommand(light);

        Invoke lightOnButton = new Invoker(lightOnCommand);

        Invoke lightOffButton = new Invoker(lightOffCommand);

        lightOnButton.runCommand();

        lightOffButton.runCommand();
    }

    @Test
    public void noCommand() {

        // 出产设置给调用者的命令
        Invoke invoker = new Invoker(new NoCommand());

        invoker.runCommand();

        Receive light = new Light();

        Command lightOnCommand = new LightOnCommand(light);

        // 用户设置为开灯命令
        invoker = new Invoker(lightOnCommand);

        invoker.runCommand();

    }

}