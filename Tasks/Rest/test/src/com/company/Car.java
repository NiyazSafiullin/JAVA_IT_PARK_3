package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Car {
    String model;
    int MaxSpeed;


    public boolean equals(Car car) {
        return this.model==car.model;
    }

    @Override
    public int hashCode() {
        return MaxSpeed;
    }

    public static void main(String[] args) {
     Car car1= new Car();
     car1.model="Ferrari";
     car1.MaxSpeed=300;
        Car car2 = new Car();
        car2.model = "Ferrari";
        car2.MaxSpeed = 300;
//        System.out.println(car1.equals(car2));

        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i=0;i<=100;i++) {
            lottery.add(i);

        }
        Collections.shuffle(lottery);
        System.out.println("Из барабан выходят числа=");
        for (int i=0;i<=100;i++) {
            System.out.println(lottery.get(i));
        }

    }
}