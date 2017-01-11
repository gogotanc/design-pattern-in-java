package com.tanc.designPattern.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 组合模式测试类
 * Created by tanc on 2017/1/11.
 */
public class CompositeTest {

    @Test
    public void operation() throws Exception {

        /*
         * tree init like this:
         *
         *                *
         *              / | \
         *             /  |  \
         *            *   *   *
         *               / \
         *              /   \
         *             *     *
         */

        List<Component> list_3 = new ArrayList<>();
        list_3.add(new Leaf("第三层第一个节点"));
        list_3.add(new Leaf("第三层第二个节点"));

        List<Component> list_2 = new ArrayList<>();
        list_2.add(new Leaf("第二层第一个节点"));
        list_2.add(new Tree(list_3));
        list_2.add(new Leaf("第二层第三个节点"));

        Component root = new Tree(list_2);


        System.out.println("root 节点 operation()：");
        root.operation();

        Component c22 = root.getChild(0);
        System.out.println("root 的第一个子节点 operation()：");
        c22.operation();
    }
}