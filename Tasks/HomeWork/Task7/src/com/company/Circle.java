package com.company;

public class Circle extends Figure {
    double radios;
     double pi = 3.14;

    public Circle(double radios) {
        this.radios = radios;
    }

    public Circle() {
    }

    public double getRadios() {
        return radios;
    }

    public void setRadios(double radios) {
        this.radios = radios;
    }

    public double squares(double radios) {
       double result=0;
        if (radios > 0) {
            result=  pi * (radios * radios);
            System.out.println("Площадь круга=" + result);
        } else {
            System.err.println("Площадь круга не может быть меньше нуля");
        }
        return result;
    }
    public double perimetr (double radios) {
        double result=0;
        if (radios > 0) {
            result= 2* pi * radios;
            System.out.println("Периметр круга=" + result);
        } else {
            System.err.println("Площадь круга не может быть меньше нуля");
        }
        return result;
    }
    }
