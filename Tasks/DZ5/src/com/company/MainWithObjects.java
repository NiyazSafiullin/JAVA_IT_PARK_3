package com.company;

import com.company.Document;

public class MainWithObjects {
    public static void main(String[] args) {
        Document document = new Document();
        Document document1 = new Document();
        document.addLineToBegin("Hello");
        document.addLineToBegin("Bye");
        document1.addLineToEnd("Russia");
    }
}