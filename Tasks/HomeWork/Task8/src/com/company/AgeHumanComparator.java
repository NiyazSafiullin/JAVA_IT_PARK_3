package com.company;

public class AgeHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        return a.getAge()-b.getAge();


    }
}
