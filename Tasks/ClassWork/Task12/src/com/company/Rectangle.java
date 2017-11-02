package com.company;

public class Rectangle {
   private double a;
   private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
public Rectangle() {

}
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public boolean equals(Object object) {
        if (object == null || !(object instanceof Rectangle)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        Rectangle that = (Rectangle) object;
        return this.a == that.b &&
                this.a == that.b;
    }
}
