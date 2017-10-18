package com.company;

public class Triangle extends Figure{
    double height;
    double area;
    double c;

    public Triangle(double height, double area,double c) {
        this.height = height;
        this.area = area;
        this.c=c;
    }
    public Triangle () {

    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double square (double base,double height) {

       area = (base* height)/2;
        System.out.println("Площадь треугольника=" + area);
     return area;
    }
    public double perimetr (double base,double height,double c) {

        area = base+height+c;
        System.out.println("Периметр треугольника=" + area);
        return area;
    }
}
