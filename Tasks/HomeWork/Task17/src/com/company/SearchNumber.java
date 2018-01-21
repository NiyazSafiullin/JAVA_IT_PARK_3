package com.company;

public class SearchNumber {
    public void SearchNumber(int number) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println( );
        //System.out.println(Thread.currentThread().getName() + ":" + " " + " chislo" + " " + number);

        System.out.println(Thread.currentThread().getName()+ " " + "Чило из матрицы" + " " + number+ " "+ "индекс элемента " );
    }
}

