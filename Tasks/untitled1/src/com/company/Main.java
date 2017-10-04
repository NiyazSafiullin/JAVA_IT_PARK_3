package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Document document = new Document();


        //  System.out.println();
        System.out.println("Выберите команду");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.showMenu();

            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    document.showDocuments();
                    break;
                }
                case 2: {
                    document.addLineToBegin("Привет");
                    document.addLineToBegin("Мир");
                }
                break;
                case 4: {
                    document.deleteDocuments();
                    break;

                }

                case 6: {
                    document.clearDocuments();
                    break;

                }

                case 7:
                    System.exit(0);


            }


        }

    }
}

