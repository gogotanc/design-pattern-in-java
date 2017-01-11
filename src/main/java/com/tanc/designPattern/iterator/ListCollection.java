package com.tanc.designPattern.iterator;

import java.util.List;

/**
 * 迭代器模式：使用列表实现的集合
 * Created by tanc on 2017/1/11.
 */
public class ListCollection implements Collection{

    private List items;

    public ListCollection(List list) {
        this.items = list;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(items);
    }
}
