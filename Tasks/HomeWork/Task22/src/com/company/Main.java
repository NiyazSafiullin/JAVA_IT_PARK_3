package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        DataReader reader = new DataReader("names.txt");
        String word = reader.readString();

        while (word.length() > 0) {
            arrayList.add(word);
            word = reader.readString();
        }

        int[] arraysage = arrayList.stream()
       // заменяем все вхождения подстроки пробелами
                .map((elements) -> elements.replaceAll("\\D", ""))
//сортировка
               .sorted((r1, r2) -> r1.compareTo(r2))
              // преобразовать поток объекта к примитивному потоку
               .mapToInt(Integer::parseInt)
               //конвертируем в массив
                .toArray();

        int max = 0; int age = 0;
        for (int j = 0; j < 100; j++) {
            int count = 0;
            for (int i = 0; i < arraysage.length; i++) {
                if (arraysage[i] ==j) count++;
            }
            if (max < count) {max = count; age = j;}
        }
        System.out.println("Количество людей "+ max +" в возрасте " + age);
    }
}
