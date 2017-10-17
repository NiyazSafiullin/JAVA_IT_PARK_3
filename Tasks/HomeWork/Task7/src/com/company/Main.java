package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Square square=new Square();
        System.out.println(" Площадь квадрата = " + square.squares(6));
        System.out.println("Периметр квадрата = " + square.perimetr(6));
        Rectangle rectangle=new Rectangle();
        System.out.println(" Площадь прямоугольника = " + rectangle.Squareds(5,5));
        System.out.println(" Периметр прямоугольника = " + rectangle.Perimetrs(5,5));

    }
}
