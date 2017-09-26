package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [] Array= new int [7];
        int nechet=0;  int chet=0;
	Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести элементы массива ");
        for (int i=0;i<Array.length;i++) {
            Array[i]=scanner.nextInt();
          if (Array[i]%2==0) {

              chet=chet+Array[i];
              //System.out.println("Четный элемент массива " + Array[i]);

          }

           else if(Array[i]%2!=0) {

              nechet=nechet+Array[i];

          }

        }
        System.out.println("Сумма нечетных элементов массива " + nechet + " ");
        System.out.println("Сумма четных элементов массива " + chet);
    }
}
