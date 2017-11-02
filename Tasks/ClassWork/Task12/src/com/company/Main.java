package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        Circle circle1 =new Circle(2);
        Circle circle2= new Circle(3);
        Circle circle3= new Circle(3);
	Rectangle rectangle1=new Rectangle(2,3);
        Rectangle rectangle4=new Rectangle(2,3);
	Rectangle rectangle2= new Rectangle(2,3);
      arrayList.add(circle1);
      arrayList.add(circle2);
      arrayList.add(rectangle1);
      arrayList.add(rectangle2);
        System.out.println(arrayList.get(1));


        //System.out.println(arrayList.f);
    }
}
