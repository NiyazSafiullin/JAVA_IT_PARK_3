package com.company;

import java.util.Scanner;

public class Document {
    int count = 0;
    int temp=0;
    String[] Lines = new String[9];


    void showDocuments() {
        for (int i = 0; i < Lines.length; i++) {
            String lineToOut = Lines[i] == null ? "_______" : Lines[i];
            System.out.println(i + ": " + lineToOut);
        }
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
        Lines[0] = rez;
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
Lines[i]=rez;
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
                Lines[i] = zamena;
            }

            count++;
        }
    }
}