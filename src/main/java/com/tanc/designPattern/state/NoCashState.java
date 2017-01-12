package com.tanc.designPattern.state;

/**
 * 状态模式：没钱的状态
 * Created by tanc on 2017/1/12.
 */
public class NoCashState extends ATMState {

    private ATMMachine machine;

    public NoCashState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    void tackCash(int money) {
        System.out.println("No enough money.");
    }
}
