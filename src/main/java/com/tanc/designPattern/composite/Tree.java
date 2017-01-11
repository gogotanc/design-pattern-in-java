package com.tanc.designPattern.composite;

import java.util.List;

/**
 * 组合模式：树节点
 * Created by tanc on 2017/1/11.
 */
class Tree extends Component {

    List<Component> components;

    public Tree(List<Component> components) {
        this.components = components;
    }

    @Override
    public void operation() {
        for (Component component : components) {
            try {
                component.operation();
            } catch (UnsupportedException e) {}
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
