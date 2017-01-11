package com.tanc.designPattern.composite;

/**
 * 组合模式：叶子节点
 * Created by tanc on 2017/1/11.
 */
class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("leaf : " + name);
    }
}
