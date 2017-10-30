package com.company;

public class ArrayList implements List {
    int count=0;
    int [] array= new int [5];

    @Override
    public void add(int elem) {

               if (count==array.length) {
                   System.err.println("Нет место");
               } else {
                   array[count] = elem;
                   count++;
               }
    }

    @Override
    public void delete(int b) {
         if (count==0) {
             System.err.println("Список пуст");
         }else {
            for (int i=b;i<array.length-1;i++) {
                array[i]=array[i+1];
            }
         }
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
