package ru.itpark;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        public static void reverse (int[] array[]){
            for (int i = 0; i < array.length / 2; ++i) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

        }
    }




    public static void InsertBysort() {
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[7];
        int kol = 0;
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();

            System.out.println(Array[i]);

    }

    }
}
