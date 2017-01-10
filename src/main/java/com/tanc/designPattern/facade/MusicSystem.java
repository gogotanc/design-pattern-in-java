package com.tanc.designPattern.facade;

/**
 * 外观模式：音响子系统
 * Created by tanc on 2017/1/10.
 */
public class MusicSystem {

    public void music() {
        System.out.println("音响系统：音效全开。");
    }

    public void off() {
        System.out.println("音响系统：关闭。");
    }
}
