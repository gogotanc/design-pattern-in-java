package com.tanc.designPattern.state;

/**
 * 状态模式：状态接口
 * Created by tanc on 2017/1/12.
 */
public abstract class ATMState {

    String name;

    abstract void tackCash(int money);
}
