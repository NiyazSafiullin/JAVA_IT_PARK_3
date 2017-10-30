package com.company;

public class ArrayList {
private int count=0;
private Object arrayList[];


    public ArrayList() {
        this.count = 0;
        this.arrayList = new Object[10];
    }



    public ArrayList(int count, Object[] arrayList) {
        this.count = count;
        this.arrayList = arrayList;
    }
}
