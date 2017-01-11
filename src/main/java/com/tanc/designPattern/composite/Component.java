package com.tanc.designPattern.composite;

/**
 * 组合模式：组件接口
 * Created by tanc on 2017/1/11.
 */
abstract class Component {

    void operation() throws UnsupportedException {
        throw new UnsupportedException();
    }

    void add(Component component) throws UnsupportedException {
        throw new UnsupportedException();
    }

    void remove(Component component) throws UnsupportedException {
        throw new UnsupportedException();
    }

    Component getChild(int index) throws UnsupportedException {
        throw new UnsupportedException();
    }
}
