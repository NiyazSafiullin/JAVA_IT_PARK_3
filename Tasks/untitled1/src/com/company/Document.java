package com.company;

public class Document {
    int count=0;
    String [] Lines= new String[3];


    void showDocuments() {
        for (int i=0;i<Lines.length;i++) {
            String lineToOut = Lines[i] == null ? "_______" : Lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    void clearDocuments() {
        for (int i=0;i<Lines.length;i++) {
            Lines[i]=null;
            System.out.println(Lines[i]);
        }
    }
    void addLineToBegin(String newLine) {
        for (int i = count; i > 0; i--) {
            Lines[i] = Lines[i - 1];
        }
        Lines[0] = newLine;
        count++;
    }
}
