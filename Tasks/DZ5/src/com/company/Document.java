package com.company;// Класс документ - отдельный файл
// от класса можно создавать ОБЪЕКТЫ

public class Document {
    // каждый объект класса будет иметь свои копии
    // count и lines
    int count = 0;
    String lines[] = new String[3];

//   public void showDocument() {
//        for (int i = 0; i < lines.length; i++) {
//            // тернарный условный оператор e ? a : b
//            String lineToOut = lines[i] == null ? "_______" : lines[i];
//            System.out.println(i + ": " + lineToOut);
//        }
//    }

  // public void addLineToBegin(String newLine) {
    //    for (int i = count; i > 0; i--) {
      //      lines[i] = lines[i - 1];
        //}
        //lines[0] = newLine;
       // count++;
    //}

//    public void addLineToEnd(String newLine) {
//        lines[count] = newLine;
//        count++;
//    }
}