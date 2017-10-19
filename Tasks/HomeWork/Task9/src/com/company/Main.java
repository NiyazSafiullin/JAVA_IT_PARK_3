package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        while (true) {
            Menu.showMenu();
            int comand = scanner.nextInt();
            switch (comand) {

                case 1: {
                    System.out.println("Введите элемент списка");
                    int elem = scanner.nextInt();
                    list.add(elem);
                } break;
                case 2: {
                    int b=scanner.nextInt();
                    list.delete(2);
                }
                case 6: {
                    System.exit(0);
                }
            }
        }
    }
}
