package com.company;

public class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void info() {

        System.out.println("Имя: " + name + " Фамилия: " + surname);
    }

    public void displayinfo() {
    }
}
