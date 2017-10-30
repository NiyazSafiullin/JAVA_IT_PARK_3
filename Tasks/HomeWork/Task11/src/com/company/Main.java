package com.company;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader("names.txt");
        LinkedList age[] =new LinkedList[100];
        for (int i=0;i<age.length;i++) {
            age[i]=new LinkedList();
        }
//        while (word.length() > 0) {
//            System.out.println(word);
//            word = reader.readString();
//        }

        System.out.println("");

    }
}