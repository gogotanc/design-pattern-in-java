package com.tanc.designPattern.command;

/**
 * 命令模式：命令接口
 * Created by tanc on 2017/1/9.
 */
public interface Command {

    void execute();

    //void undo(); // 需要 undo 功能在这里添加即可
}
