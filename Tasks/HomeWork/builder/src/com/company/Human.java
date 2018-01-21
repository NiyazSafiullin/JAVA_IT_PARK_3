package com.company;

import javafx.util.Builder;

public class Human {
    private int age;
    private String name;
    private double height;
    private double weight;
    private char sex;
    private boolean isReligion;
    private String color;
    private String dressSize;

    private  Human (Builder builder) {
        this.age=builder.age;
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
        this.sex = builder.sex;
        this.isReligion = builder.isReligion;
        this.color = builder.color;
        this.dressSize = builder.dressSize;

    }
    private static class Builder {
        private int age;
        private String name;
        private double height;
        private double weight;
        private char sex;
        private boolean isReligion;
        private String color;
        private String dressSize;

        public Builder age (int age) {
            this.age=age;
            return this;
        }
public Builder name (String name) {
            this.name=name;
            return this;
}
public Builder height (double height) {
            this.height=height;
            return this;
}


        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder sex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder isReligion(boolean isReligion) {
            this.isReligion = isReligion;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder dressSize(String dressSize) {
            this.dressSize = dressSize;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }


}
