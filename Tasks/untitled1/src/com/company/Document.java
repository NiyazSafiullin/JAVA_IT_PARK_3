package com.company;

public class Document {
    int count=0;
    String [] Lines={"sasasa","sasasas","dsdwdw"};


    void showDocuments() {
        for (int i=0;i<Lines.length;i++) {
            String lineToOut = Lines[i] == null ? "_______" : Lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    void clearDocuments() {
        for (int i=0;i<Lines.length;i++) {
            Lines[i]=null;
        }
    }
}
