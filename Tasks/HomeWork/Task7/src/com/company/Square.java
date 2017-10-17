package com.company;

public class Square {
    public int a;

Square () {
    a=5;

}
Square (int a) {
    this.a=a;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void squares (int a) {
   if (a>0) {
       System.out.println("Площадь квадрата=" + a*a);
   } else
       System.err.println("Площадь квадрата не может быть равным нулю");
   }

    public void perimetr (int a) {
     if (a>0) {
         System.out.println("Периметр квадрата=" + 4*a);
     } else
         System.err.println("Периметр квадрата не может быть нулевым");
    }

}

