package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Car car= Car.builder()
                .model("opel").year(2013).max_speed(200).build();

    }
}
