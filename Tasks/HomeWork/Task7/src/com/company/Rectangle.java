package com.company;

public class Rectangle extends Square {

    double b;

    Rectangle() {

        b = 7;
    }

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public void Squareds(double a, double b) {
        if (a > 0 && b > 0) {
            System.out.println("Площадь прямоугольника = " + (a + b) * 2);
        } else System.err.println("Площадь прямоугольника не может быть нулевым");

    }

    public void Perimetr(double a, double b) {
        if (a > 0 && b > 0) {
            System.out.println("Площадь прямоугольника = " + (a + b) * 2);
        } else System.err.println("Площадь прямоугольника не может быть нулевым");

    }
}