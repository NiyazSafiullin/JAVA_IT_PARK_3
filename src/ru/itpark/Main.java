//package com.company;
import java.awt.image.AreaAveragingScaleFilter;
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
        //РџСѓРЅРєС‚ 1-2 Р”Р—
        System.out.println("1-2 РїСѓРЅРєС‚Р° Р”Р—");
        System.out.println("Р’РІРµРґРёС‚Рµ СЌР»РµРјРµРЅС‚С‹ РјР°СЃСЃРёРІР° ");

        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
            if (Array[i] % 2 == 0) {
                sum = sum + Array[i];
            }
            if (Array[i]%2!=0) {
                isum=isum+Array[i];
            }
        }
        System.out.println("РЎСѓРјРјР° С‡РµС‚РЅС‹С… С‡РёСЃРµР» =" + " " + sum);
        System.out.println("РЎСѓРјРјР° РЅРµС‡РµС‚РЅС‹С… С‡РёСЃРµР» =" + " " + isum);
        System.out.println();
        //РџСѓРЅРєС‚ 3-4 Р”Р—
        System.out.println("3-4 РїСѓРЅРєС‚Р° Р”Р—");
        System.out.println("Р’РІРµРґРёС‚Рµ СЌР»РµРјРµРЅС‚С‹ РјР°СЃСЃРёРІР° ");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scanner.nextInt();
            k = i;
            if (k % 2 == 0) {
                summh = summh + 1;
            } else if (k % 2 != 0) {
                summn = summn + 1;
            }
        }

        System.out.println("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ, СЃС‚РѕСЏС‰РёС… РЅР° С‡РµС‚РЅРѕР№ РїРѕР·РёС†РёРё " + summh);

        System.out.println("РЎСѓРјРјР° СЌР»РµРјРµРЅС‚РѕРІ, СЃС‚РѕСЏС‰РёС… РЅР° РЅРµС‡РµС‚РЅРѕР№ РїРѕР·РёС†РёРё " + summn);

        System.out.println();
        System.out.println("5 РїСѓРЅРєС‚ Р”Р—");

        // РџСѓРЅРєС‚ 5
        System.out.println("Р’РІРµРґРёС‚Рµ СЌР»РµРјРµРЅС‚С‹ РјР°СЃСЃРёРІР° ");
        for (int i=1;i<Array.length-1;i++) {

            Array[i] = scanner.nextInt();
            if (Array[i-1]<Array[i]&& Array[i]>Array[i+1]) {
                kol++;
            }


        }
        System.out.println("РљРѕР»РёС‡РµСЃС‚РІРѕ Р»РѕРєР°Р»СЊРЅС‹С… РјР°РєСЃРёРјСѓРјРѕРІ " + kol);
        System.out.println();
        System.out.println("6 РїСѓРЅРєС‚ Р”Р—");
//        // РџСѓРЅРєС‚ 6 Р”Р—


        int[] Array6 = {-1, 2, 5, 7, -9, -16, 88};
        System.out.println("1, 2, 5, 7, -9, -16, 88");
        int kolm = 1;
        for (int i = 1; i < Array6.length-1; i++) {


            if (Array6[i]<Array6[i+1]&& Array6[i]>Array6[i-1]) {

                kolm++;


            }


        }

        System.out.println("РњР°РєСЃРёРјР°Р»СЊРЅР°СЏ РґР»РёРЅР° РїРѕСЃР».РІРѕР·СЂ.С‡РёСЃРµР» = " + kolm);
        System.out.println();
        System.out.println("7 РїСѓРЅРєС‚ Р”Р—");
        // РџСѓРЅРєС‚ 7 Р”Р—
        System.out.println();
        int [] Array2 = {1,2,0,5,4,0,3};
        for (int i = 0; i < Array.length; i++) {

            if (Array2[i] == 0) {

                Array2[i] = Array2[i+1]*-1;


            }
            System.out.print(Array2[i] + " ");
        }

    }
}





