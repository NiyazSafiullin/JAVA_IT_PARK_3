package ru.itpark;

public class Main {

    public static void main(String[] args) {
        int array[] = {3, 5, 2, 3, 1, 6, 9};
        int min=0; int max=0;
        for (int i = 0; i<array.length; i++) {
            min=array[0];
            if (array[i]< min) {
                min = array[i];
            }
            }
            //System.out.println(min);

            for (int j = 0; j < array.length; j++) {
                max=array[0];
                if (array[j] > max) {
                    max = array[j];

                }



            }
            //System.out.print(max);
            int temp=min;
            min=max;
            max=temp;
        System.out.println(min);
        System.out.println(max);
            // развернуть массив без использования
            // допольнительного массива
        /*
            a[0] <-> a[6]
            a[1] <-> a[5]
            a[2] <-> a[4]
            Таким образом, всего 7 элементов,
            нужно сделать 3 шага.
            Обобщаем задачу - пусть n - размер
            Следовательно нужно сделать
            n / 2 итераций
            a[i] <-> a[n - 1 - i]
            int temp = a;
            a = b;
            b = temp;
         */

        }
    }

