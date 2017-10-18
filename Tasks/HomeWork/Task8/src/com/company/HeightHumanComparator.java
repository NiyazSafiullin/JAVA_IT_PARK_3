package com.company;

public class HeightHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        return a.getAge()-b.getAge();
    }
}
