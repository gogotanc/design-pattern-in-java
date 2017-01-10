package com.tanc.designPattern.adapter;

/**
 * 适配器模式：适配器
 * Created by tanc on 2017/1/10.
 */
public class Adapter implements NewInterface {

    OldInterface oldInterface;

    public Adapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void showAndRun() {
        oldInterface.oldShow();
        oldInterface.oldRun();
    }
}
