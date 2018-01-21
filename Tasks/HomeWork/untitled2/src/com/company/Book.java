package com.company;

public class Book {
    String name;
    public Book(String name) {
        this.name=name;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Книга";
    }

//    @Override
//    public int hashCode() {
//        return 20*this.name.hashCode();
//    }
//
}
