package com.company;

public class Main {

    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
       // char digits[] = {'1', '2', '6', '7'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt); // 3241 должно быть на экране

    }



    public static int parse(char numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int result = (int) numbers[i];
            System.out.print(result+ " ");

           // return result;
        }

        return 0;
    }


    }