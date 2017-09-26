package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       // Сумма четных элементов
        //Сумма нечетных элементов
        int [] Array= new int [7];
        int nechet=0;  int chet=0; int cshet=0; int cnechet=0;
	Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести элементы массива ");
        for (int i=0;i<Array.length;i++) {
            Array[i]=scanner.nextInt();
          if (Array[i]%2==0) {
              chet=chet+Array[i];
                        }

           else if(Array[i]%2!=0) {

              nechet=nechet+Array[i];
          }

        }
        System.out.println("Сумма нечетных элементов массива " + nechet);
        System.out.println("Сумма четных элементов массива " + chet);


        /////Cумма элементов, стоящих на четной позиции
       /// Сумма элементов, стоящих на нечетной позиции
        System.out.println("Ввести элементы массива ");
         for (int j=0;j<Array.length;j++) {
             Array[j]=scanner.nextInt();
             cshet= Array[j];
             j++;
             System.out.println(cshet);
         }

    }
}
