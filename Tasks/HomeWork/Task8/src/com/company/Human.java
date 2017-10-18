package com.company;

public class Human {
    String name;
    int height;
    int age;
    double weight;

    public Human(String name, int height, int age, double weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }
    public  Human () {

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
