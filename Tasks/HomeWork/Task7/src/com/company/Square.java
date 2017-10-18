package com.company;

public class Square extends Figure {
    public double a;

public Square () {


}
public Square (double a) {
    this.a=a;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void squares (double a) {
   if (a>0) {
       System.out.println("Площадь квадрата=" + a*a);
   } else
       System.err.println("Площадь квадрата не может быть равным нулю");
   }

    public void perimetr (double a) {
     if (a>0) {
         System.out.println("Периметр квадрата=" + 4*a);
     } else
         System.err.println("Периметр квадрата не может быть нулевым");
    }

}

