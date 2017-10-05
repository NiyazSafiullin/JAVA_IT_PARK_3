<<<<<<< HEAD
﻿package com.company;
=======
package com.company;
import java.awt.image.AreaAveragingScaleFilter;
>>>>>>> 9980dcdab001027d7092078be24635404f6efd07
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array = new int[7];
        int kol = 0;
        int sum = 0;
        int isum = 0;
        int k = 0;
        int summh = 0;
        int summn = 0;
        //Пункт 1-2 ДЗ
        System.out.println("1-2 пункта ДЗ");
        System.out.println("Введите элементы массива ");

        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
            if (Array[i] % 2 == 0) {
                sum = sum + Array[i];
            }
            if (Array[i]%2!=0) {
                isum=isum+Array[i];
            }
        }
        System.out.println("Сумма четных чисел =" + " " + sum);
        System.out.println("Сумма нечетных чисел =" + " " + isum);
        System.out.println();
          //Пункт 3-4 ДЗ
        System.out.println("3-4 пункта ДЗ");
        System.out.println("Введите элементы массива ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
            k = i;
            if (k % 2 == 0) {
                summh = summh + 1;
            } else if (k % 2 != 0) {
                summn = summn + 1;
            }
        }

        System.out.println("Сумма элементов, стоящих на четной позиции " + summh);

        System.out.println("Сумма элементов, стоящих на нечетной позиции " + summn);

        System.out.println();
        System.out.println("5 пункт ДЗ");

       // Пункт 5
        System.out.println("Введите элементы массива ");
   for (int i=1;i<Array.length-1;i++) {

       Array[i] = scanner.nextInt();
    if (Array[i-1]<Array[i]&& Array[i]>Array[i+1]) {
        kol++;
    }


    }
        System.out.println("Количество локальных максимумов " + kol);
        System.out.println();
        System.out.println("6 пункт ДЗ");
//        // Пункт 6 ДЗ


        int[] Array6 = {1, 2, 5, 7, -9, -16, 88};
        System.out.println("1, 2, 5, 7, -9, -16, 88");
        int kolm = 1;
        for (int i = 1; i < Array6.length-1; i++) {


            if (Array6[i]<Array6[i+1]&& Array6[i]>Array6[i-1]) {

                kolm++;


            }


        }
<<<<<<< HEAD
        System.out.println("Сумма нечетных элементов массива " + nechet + " ");
        System.out.println("Сумма четных элементов массива " + chet);
=======

        System.out.println("Максимальная длина посл.возр.чисел = " + kolm);
        System.out.println();
        System.out.println("7 пункт ДЗ");
        // Пункт 7 ДЗ
        System.out.println();
        int [] Array2 = {1,2,0,5,4,0,3};
        for (int i = 0; i < Array.length; i++) {

            if (Array2[i] == 0) {

                Array2[i] = Array2[i+1]*-1;


            }
            System.out.print(Array2[i] + " ");
                     }

>>>>>>> 9980dcdab001027d7092078be24635404f6efd07
    }
        }





