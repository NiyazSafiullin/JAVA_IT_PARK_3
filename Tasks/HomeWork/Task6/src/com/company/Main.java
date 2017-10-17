package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu=new Menu();
     Telecast telecast=new Telecast();
     Telecast telecast1=new Telecast("ntv","uuu", "19:00","19:50");

     RT rt=new RT("RT", "music", "09:00", "18:00");
     Sport sport=new Sport("sport", "footbal", "12:00", "14:00");


        Scanner scanner=new Scanner(System.in);


       while (true) {
           menu.showMenu();
           int command=scanner.nextInt();
          switch (command) {

              case 1: {
                 telecast.show();
                 // telecast.raspisanie();
                  System.out.println();
              } break;
              case 2: {

              }break;
              case 3: {

              }
              case 4: {
                  rt.show();
                  System.out.println();
              }break;
              case 5: {
                  sport.show();
                  System.out.println();
              }break;
              case 6: {

              }break;
              case 7: {
                  System.exit(0);
              }
          }


      }









    }
}
