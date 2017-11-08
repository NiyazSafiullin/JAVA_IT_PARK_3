package com.company;

import java.sql.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        Class.forName("org.postgres.Driver");
        String name="postgres";
        String password= "Zaq12wsx";
        String url="jdbc:postgresql:" +
        "//localhost:5432/safiullin_nh";

        Connection connection =
                DriverManager.getConnection(
                        url, name, password);

        Statement statement =
                connection.createStatement();



        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.showMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                    ResultSet resultSet1 =
                            statement
                                    .executeQuery("SELECT * FROM owner");

                    while (resultSet1.next()) {
                        System.out.print(resultSet1.getInt("id"));
                        System.out.println(" " + resultSet1.getString("name"));

                                          }
                }break;
                case 4: {
                    ResultSet resultSet1 =
                            statement
                                    .executeQuery("SELECT * FROM car");

                    while (resultSet1.next()) {
                        System.out.print(resultSet1.getInt("id"));
                        System.out.println(" " + resultSet1.getString("model"));

                    }

                    System.out.println();
                }
                break;
                case 5: {

                    System.out.println();
                }
                break;
                case 6: {

                }
                break;
                case 7: {
                    System.exit(0);
                }
            }


        }


    }
}