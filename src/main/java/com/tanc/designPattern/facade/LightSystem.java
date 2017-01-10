package com.tanc.designPattern.facade;

/**
 * 外观模式：灯光子系统
 * Created by tanc on 2017/1/10.
 */
public class LightSystem {

    public void lightOff() {
        System.out.println("灯光系统：光线变暗。");
    }

    public void lightOn() {
        System.out.println("灯光系统：光线恢复。");
    }
}
