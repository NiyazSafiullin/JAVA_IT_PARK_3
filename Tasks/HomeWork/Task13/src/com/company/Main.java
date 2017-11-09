package com.company;

import java.sql.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        Class.forName("org.postgres.Driver");

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            menu.showMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите имя:");
                    String name=scanner.next();
                    System.out.println("Введите возраст:");
                    int age=scanner.nextInt();
                    working.add(name,age);
                 }
                break;
                case 2: {
                    System.out.println("Введите номер автомобиля:");
                    int number=scanner.nextInt();
                    System.out.println("Введите модель автомобиля:");
                    String model=scanner.next();
                    System.out.println("Введите цвет автомобиля:");
                    String color=scanner.next();
                    working.addcar(number,model,color);
                }
                break;
                case 3: {
                 working.viewowner();

                }break;
                case 4: {
                    working.viewcar();

            }
                break;
                case 5: {

                    System.out.println("Введите имя владельца:");
                    String drivers=scanner.next();
                    working.viwecar(drivers);
                }
                break;
                case 6: {
                    System.out.println("Введите цвет машины:");
                    String col=scanner.next();
                    working.viwecarcolor(col);


                }
                break;
                case 7: {
                    System.exit(0);
                }
            }


        }


    }
}