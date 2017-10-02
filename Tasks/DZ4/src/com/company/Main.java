package com.company;

public class Main {

    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
       // char digits[] = {'1', '2', '6', '7'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt); // 3241 должно быть на экране

    }



    public static int parse(char numbers[]) {
        int rezult=0;
        for (int i = 0; i < numbers.length; i++) {
            int position = numbers.length-1-i;
            int chislo=1;
            for (int j=0;j<position;j++) {
                chislo = chislo * 10;
            }

                       rezult=rezult+ (numbers[i]-48)*chislo;

           // return 0;
        }

        return rezult;
    }

    }
