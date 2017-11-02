package com.company;

public class Circle {
    private double radios;
    static final double pi=3.14;

    public Circle(double radios) {
        this.radios = radios;
    }
    public Circle() {
    }


    public double getRadios() {
        return radios;
    }

    public static double getPi() {
        return pi;
    }
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Circle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

       Circle that = (Circle) object;
        return this.radios == that.pi &&
                this.radios == that.pi;
    }
}
