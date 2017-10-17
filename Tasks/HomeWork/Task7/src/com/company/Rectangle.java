package com.company;

public class Rectangle extends Square {

    int b;

    Rectangle() {

        b = 7;
    }

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public void Squareds(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Площадь прямоугольника = " + (a + b) * 2);
        } else System.err.println("Площадь прямоугольника не может быть нулевым");

    }

    public void Perimetr(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Площадь прямоугольника = " + (a + b) * 2);
        } else System.err.println("Площадь прямоугольника не может быть нулевым");

    }
}