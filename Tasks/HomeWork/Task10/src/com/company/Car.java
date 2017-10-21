package com.company;

public class Car {
   private String model;
    private int year;
    private String color;
    private int max_speed;
    private double gasoline_consumption;

private Car(Builder builder) {
this.model=builder.model;
this.year=builder.year;
this.color=builder.color;
this.max_speed=builder.max_speed;
this.gasoline_consumption=builder.gasoline_consumption;
}
public static class Builder {
    private String model;
    private int year;
    private String color;
    private int max_speed;
    private double gasoline_consumption;


    public Builder model(String model) {
    this.model=model;
    return this;
    }
    public Builder year(int year) {
    this.year=year;
    return this;
    }
    public Builder color(String color) {
        this.color=color;
        return this;
    }
    public Builder max_speed (int max_speed) {
        this.max_speed=max_speed;
        return this;
    }
    public  Builder gasoline_consumption (double gasoline_consumption) {
        this.gasoline_consumption=gasoline_consumption;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}
    public static Builder builder() {
        return new Builder();
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public double getGasoline_consumption() {
        return gasoline_consumption;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public void setGasoline_consumption(double gasoline_consumption) {
        this.gasoline_consumption = gasoline_consumption;
    }
}
