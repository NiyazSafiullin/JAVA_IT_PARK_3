package com.company;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataReader reader = new DataReader("input.txt");
        String word = reader.readString();
        DataReader numberReader = new DataReader("input.txt");
       int number = numberReader.readInteger();

        List yearList[] = new LinkedList[100];
        for (int i = 0; i < 100; i++) {
            yearList[i] = new LinkedList();
        }
        while (number != 0) {

          Human human=new Human(word,number);
            yearList[number].add(human);
            number=numberReader.readInteger();
            word=reader.readString();
        }


    }
}
