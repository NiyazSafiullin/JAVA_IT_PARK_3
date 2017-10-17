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

    public int squares (int a) {
    return a*a;

    }
    public int perimetr (int a) {
      return 4*a;
    }
}

