package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Document document=new Document();

        menu.showMenu();
      //  System.out.println();
        System.out.println("Выберите команду");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();
        switch (command) {
            case 1: {
                document.showDocuments();
                break;
            }

            case 6: {

                break;

            }

            case 7:
                System.exit(0);




        }


    }

}

