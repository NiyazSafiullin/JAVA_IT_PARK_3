package com.company;
import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import jdk.internal.util.xml.impl.Input;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import javax.swing.text.View;

public class Main {

    public static void main(String[] args) {
try {
    URL url= new URL("http://www.yandex.ru");
    InputStream is=url.openStream();
    ByteArrayOutputStream baos=new ByteArrayOutputStream();
    int b;
    while ((b=is.read())!=-1) {
        baos.write(b);
    }
    System.out.println(baos.toString());
//int a=5/0;
    FileInputStream fileInputStream=new FileInputStream("ghfhg.txt");

}
catch (FileNotFoundException e) {
    System.out.println("Файла нет");
}
catch (ArithmeticException e) {
    System.out.println("Операция деление на ноль запрещено" );
}
catch (MalformedURLException e) {
  System.out.println("Ошибка протокола" + e);
}

catch (UnknownHostException e) {
    System.out.println("Неизвестный хост"+ e);
}
catch (Exception e) {
    System.out.println("Исключение:" + e);
}
finally {
    System.out.println("Finally");
}


    }


}