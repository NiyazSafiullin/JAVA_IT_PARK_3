package com.company;

public class Main {

    public static void main(String[] args) {
	Human niyaz=new Human("Niyaz",30,184,80);
    Human alex= new Human("Alex", 31, 185,85);

Human humans [] ={niyaz,alex};
        for (Human human:humans)
              {
                  System.out.println(human);
        }
    }

    }
