package com.company;

public class Main {

    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
        char digits[] = {'1', '2', '6', '7'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt); // 3241 должно быть на экране

    }



    public static int parse(char digits[]) {
        for (int i = 0; i < digits.length; i++) {
            int result = (int) digits[i];
            System.out.print(result+ " ");
        }

        return 0;
    }


    }