package com.company;
import java.util.Scanner;

import javafx.scene.shape.TriangleMesh;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square square=new Square();
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Oval oval=new Oval();
        Triangle triangle=new Triangle();

        Figure[] figure = {square,circle,rectangle,oval,triangle};
        square.squares(6);
        square.perimetr(7);

        rectangle.perimetr(8);
        rectangle.squares(9);

        circle.squares(6);
        circle.perimetr(5);
        triangle.square(5,5);
        triangle.perimetr(5,6,7);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите ширину треугольника: ");
//        double base = scanner.nextDouble();

//        System.out.println("Введите высоту треугольника: ");
//        double height = scanner.nextDouble();
//        double area = (base* height)/2;
//        System.out.println("Площадь треугольника равна: " + area);

    }
}
