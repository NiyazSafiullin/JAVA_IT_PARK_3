package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Square square=new Square();
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Oval oval=new Oval();

        Figure[] figure = {square,circle,rectangle,oval};
        square.squares(6);
        square.perimetr(7);

        rectangle.perimetr(8);
        rectangle.squares(9);

        circle.squares(6);
        circle.perimetr(5);


    }
}
