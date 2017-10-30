package com.company;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataReader reader = new DataReader("input.txt");
        String word = reader.readString();
        DataReader numberReader = new DataReader("input.txt");
        int number = numberReader.readInteger();

        List yearList[] = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            yearList[i] = new LinkedList();
        }
        if (number != 0) {
            Human human = new Human("Tom", 30);
            yearList[number].add(human);
        }
    }
}
