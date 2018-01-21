package com.company;

import sun.nio.ch.ThreadPool;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.util.UUID;
import java.util.concurrent.ExecutorService;



public class Main {

    public static void main(String[] args) throws InterruptedException {

      //  List<String> mails = new ArrayList<>();
        com.company.ThreadPool threadPool = new com.company.ThreadPool(7);
        System.out.println("Ведите первое число");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Ведите второе число");
        Scanner scanner1 = new Scanner(System.in);
        int cols = scanner1.nextInt();

        Random random = new Random();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
            }

        }

        for (int i = 0; i < rows; i++, System.out.println()) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "   ");


            }

        }
        System.out.println("Введите число для поиска");
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner2.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               int t1=array[i][j];
               int t2=i;
               int t3=j;
                threadPool.submitTask(() -> {
                if (t1 == number) {
                    System.out.println("Чиcло из матрицы" + " " + number + " " + "индекс элемента " + t2 + " " + t3+ " "+ " -" +  " "+ "поток "+ " "+  Thread.currentThread().getName());
                } else System.out.println("Число не найдено");
                    //break;
                });
            }
                }
//                if(array[i][j]!=number) {
//                System.out.println("в матрице нет данного числа");
//            }


//            SearchNumber searchNumber = new SearchNumber();
//
//            threadPool.submitTask(() -> searchNumber.SearchNumber(number));




    }
}
