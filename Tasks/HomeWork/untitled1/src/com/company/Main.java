package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int [][] massiv={{1,2,3},{4,5,6}};
      for (int i=0;i<massiv.length;i++) {
          for (int j=0;j<massiv.length;j++) {

              System.out.printf("%d ", massiv[i][j]);
          }
          System.out.println();
      }







        int result= 0;
        try {
            result = getFactorial(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  System.out.println(result);
    }
    public static int getFactorial(int num) throws Exception {
        if(num<1) throw new Exception("Число не может быть меньше");
            int result=1;
        for (int i=1;i<=num;i++) {
            result*=i;
        }
        return result;

    }


}
