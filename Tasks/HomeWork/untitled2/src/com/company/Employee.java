package com.company;

public class Employee extends Person {


    private final String comapny;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.comapny=company;
    }


    public void displayinfo() {
        super.displayinfo();
        System.out.println("Комрания:" + comapny);
    }
    public void info() {
        super.info();
    }
}
