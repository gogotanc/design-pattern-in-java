package com.tanc.designPattern.iterator;

/**
 * 数组迭代器
 * Created by tanc on 2017/1/11.
 */
public class ArrayIterator implements Iterator {

    private String[] items;
    private int position;

    public ArrayIterator(String[] items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public Object next() {
        String str = items[position];
        position += 1;
        return str;
    }
}
