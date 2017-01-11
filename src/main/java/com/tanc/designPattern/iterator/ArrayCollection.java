package com.tanc.designPattern.iterator;

/**
 * 迭代器模式：使用数组实现的集合
 * Created by tanc on 2017/1/11.
 */
public class ArrayCollection implements Collection {

    private String[] items;

    public ArrayCollection(String[] items) {
        this.items = items;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator(items);
    }
}
