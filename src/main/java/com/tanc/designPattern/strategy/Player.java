package com.tanc.designPattern.strategy;

/**
 * 运动员
 *
 * @author tanc
 */
public class Player {

    private Behaviour behaviour;

    public Player(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void play() {
        behaviour.start();
        behaviour.stop();
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
}
