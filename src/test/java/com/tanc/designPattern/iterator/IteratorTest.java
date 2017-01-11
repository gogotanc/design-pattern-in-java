package com.tanc.designPattern.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 迭代器模式测试类
 * Created by tanc on 2017/1/11.
 */
public class IteratorTest {

    @Test
    public void test() {
        // 准备数据
        String[] strings = {"abc", "bcd", "cde", "def"};
        List<String> list = new ArrayList<>();
        list.add("efg");
        list.add("fgh");
        list.add("ghi");
        list.add("hij");


        Collection arrayCollection = new ArrayCollection(strings);
        Iterator it1 = arrayCollection.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Collection listCollection = new ListCollection(list);
        Iterator it2 = listCollection.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }

}