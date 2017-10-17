package com.company;

public class Rectangle extends Square {

    int b;
Rectangle () {

    b=7;
    }
    Rectangle (int a,int b) {
    this.a=a;
    this.b=b;
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
    public int Squareds (int a, int b) {
    return a*b;
    }
    public int Perimetrs(int a,int b) {
    return (a+b)*2;
    }
}
