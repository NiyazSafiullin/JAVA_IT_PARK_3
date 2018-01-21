package com.company;
import java.lang.*;

public class GenericsApp {
    public static void main(String[] args) {
      Bank<Integer> bank=new Bank(new Integer[]{1,2,3,4,5}));
    }
     class Bank<T> {

    }
}
