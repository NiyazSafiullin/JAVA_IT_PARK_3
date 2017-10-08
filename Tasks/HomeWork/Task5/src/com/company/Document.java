package com.company;

import java.util.Scanner;

public class Document {
    int count = 0;
    int temp=0;
    String[][] Lines = new String[4][4];


    void showDocuments() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Документ " + i);
            for (int j = 0; j < 4; j++) {
                String lineToOut = Lines[i][j] == null ? "_______" : Lines[i][j];
                System.out.println(j + ": " + lineToOut);
            }
        }
    }
    void showDocuments(Integer str) {
        for (int j = 0; j < 4; j++) {

            String lineToOut = Lines[str][j] == null ? "_______" : Lines[str][j];
            System.out.println(j + ": " + lineToOut);
        }
    }

    void addLineToBegin(String newLine, Integer str) {
        for (int j = count; j > 0; j--) {
            Lines[str][j] = Lines[str][j - 1];
        }
        Lines[str][0] = newLine;
        count++;
    }


    void clearDocuments() {
        for (int i = 0; i < Lines.length; i++) {
            Lines[i] = null;

        }
    }

    void addLineToBegin() {
        System.out.println("Введите строку для добавления сначало");
        Scanner scanner= new Scanner(System.in);
        String rez=scanner.nextLine();
        for (int i = count; i > 0; i--) {
            if (Lines[i] == null) {
                Lines[i] = Lines[i - 1];
            }
        }
      //  Lines[0] = rez;
        count++;
    }

    void addLineToEnd(String newLine) {
        System.out.println("Введите строку для добавления после.");
        Scanner scanner= new Scanner(System.in);
        String rez=scanner.nextLine();
        for (int i = 0; i < Lines.length; i++) {
           if (Lines[i]==null) {
               Lines[i]=Lines[i+1];
           }
//Lines[i]=rez;
        }

        count++;
    }

    void deleteDocuments() {
        System.out.println("Какую строку удалить ?");
        Scanner scanner = new Scanner(System.in);
        int vibor = scanner.nextInt();
        for (int i = 0; i < Lines.length; i++) {
            if (i == vibor) {
                Lines[i] = null;
            }

            count++;
        }


    }

    void zamena(String zamena) {
        System.out.println("Какую строку заменить ?");
        Scanner scanner = new Scanner(System.in);
        int vibor = scanner.nextInt();
        for (int i = 0; i < Lines.length; i++) {
            if (i == vibor) {
      //          Lines[i] = zamena;
            }

            count++;
        }
    }
}