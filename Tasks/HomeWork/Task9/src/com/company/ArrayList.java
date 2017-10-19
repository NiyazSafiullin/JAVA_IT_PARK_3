package com.company;

public class ArrayList implements List {
    int count=0;
    int [] array= new int [5];

    @Override
    public void add(int elem) {

               if (array.length>count)
           array[count]=elem;
           count++;

    }

    @Override
    public void delete(int a) {

    }

    @Override
    public void addindex() {

    }

    @Override
    public void returns() {

    }

    @Override
    public void search() {

    }
}
