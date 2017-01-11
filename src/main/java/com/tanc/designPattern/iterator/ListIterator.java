package com.tanc.designPattern.iterator;

import java.util.List;

/**
 * 迭代器模式：列表迭代器
 * Created by tanc on 2017/1/11.
 */
public class ListIterator implements Iterator {

    private java.util.Iterator iterator;

    public ListIterator(List items) {
        this.iterator = items.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
}
