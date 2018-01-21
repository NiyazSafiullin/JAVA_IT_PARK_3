package com.company;

public class Singleton {

    private static final Singleton instance;

    private Singleton () {
        System.out.println("Instance created");
    }
    static {
        instance=new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
