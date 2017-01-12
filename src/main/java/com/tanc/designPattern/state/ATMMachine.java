package com.tanc.designPattern.state;

/**
 * 状态模式：ATM 机器类
 * Created by tanc on 2017/1/12.
 */
public class ATMMachine extends Machine {

    private int money;

    private ATMState noCashState;
    private ATMState hasCashState;

    private ATMState currentState;

    public ATMMachine(int money) {
        this.noCashState = new NoCashState(this);
        this.hasCashState = new HasCashState(this);
        this.money = money;
        if (money > 0) {
            this.currentState = this.hasCashState;
        } else {
            this.currentState = this.noCashState;
        }
    }

    public void request(int money) {
        currentState.tackCash(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void setNoCashState(ATMState noCashState) {
        this.noCashState = noCashState;
    }

    public ATMState getHasCashState() {
        return hasCashState;
    }

    public void setHasCashState(ATMState hasCashState) {
        this.hasCashState = hasCashState;
    }
}
