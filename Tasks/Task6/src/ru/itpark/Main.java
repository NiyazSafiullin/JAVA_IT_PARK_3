package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String document[] = new String[3];
        int count = 0;
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();
            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    for (int i = 0; i < document.length; i++) {
                        // тернарный условный оператор e ? a : b
                        String lineToOut = document[i] == null ? "_______" : document[i];
                        System.out.println(i + ": " + lineToOut);
                    }
                }
                break;
                case 2: {
                    if (count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    for (int i = count; i > 0; i--) {
                        document[i] = document[i - 1];
                    }
                    document[0] = newLine;
                    count++;
                }
                break;
                case 3: {
                    if (count == document.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    document[count] = newLine;
                    count++;
                }
                break;
                case 4: {
                    if (count == document.length) {
                        System.err.println("Документ пуст");

                        break;

                    }
                    for (int i = 0; i < document.length; i++) {

                    }
                }
                break;
                case 5: {
                    if (count == document.length) {
                        System.err.println("Документ пуст");

                        break;

                    }
                    for (int i = 0; i < document.length; i++) {
                        if (document[i] != null) {

                            document[i] = "12313";
                        }
                    }
                }
                break;
                case 6: {
                    if (count == document.length) {
                        System.err.println("Документ пуст");

                        break;
                    }
                    for (int i = 0; i < document.length; i++) {
                        document[i]=null;
                    }
                }
                break;
                case 7:
                    System.exit(0);
            }
        }
    }
}