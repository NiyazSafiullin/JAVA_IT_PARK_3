package com.company;

public class ArrayList implements List {
private int count=0;
private Object arrayList[];


    public ArrayList() {
        this.count = 0;
        this.arrayList = new Object[10];
    }

    @Override
    public void concat(LinkedList otherList) {

    }

    @Override
    public void add(Object object) {

    }

    public ArrayList(int count, Object[] arrayList) {
        this.count = count;
        this.arrayList = arrayList;
    }
}
