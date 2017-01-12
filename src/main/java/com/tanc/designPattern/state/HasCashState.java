package com.tanc.designPattern.state;

/**
 * 状态模式：有钱的状态
 * Created by tanc on 2017/1/12.
 */
public class HasCashState extends ATMState {

    private ATMMachine machine;

    public HasCashState(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    void tackCash(int money) {
        if (money < machine.getMoney()) {
            System.out.println("取钱 " + money);
            machine.setMoney(machine.getMoney() - money);
        } else if (money == machine.getMoney()) {
            System.out.println("取钱 " + money);
            machine.setMoney(machine.getMoney() - money);
            machine.setCurrentState(machine.getNoCashState());
        } else {
            System.out.println("钱不够。");
        }
    }
}
