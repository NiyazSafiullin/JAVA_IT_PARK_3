package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.lang.*;

public class working {
    public static Connection connect() throws SQLException {
        String name = "postgres";
        String password = "Zaq12wsx";
        String url = "jdbc:postgresql:" +
                "//localhost:5432/safiullin_nh";

        return DriverManager.getConnection(url, name, password);
    }
    public working() throws SQLException {
    }

    public static void add(String name, int age) {
        try {
            Connection connection = working.connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO owner(name , age) VALUES (?, ?)");

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void addcar(int number, String model,String color) {
        try {
            Connection connection = working.connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO car(number ,model, color) VALUES (?, ?, ?)");

            preparedStatement.setInt(1, number);
            preparedStatement.setString(2, model);
            preparedStatement.setString(3, color);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void viewowner() {
        try {
            Connection connection = working.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ");

            System.out.println("Все владельцы:");

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
              //  System.out.println(" " + resultSet.getString("age"));
                System.out.println(" " + resultSet.getString("name"));

            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
    public static void viewcar() {
        try {
            Connection connection = working.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car ");

            System.out.println("Все автомобили:");

                while (resultSet.next()) {
                    System.out.print(resultSet.getInt("id"));
                    System.out.println(" " + resultSet.getString("model"));

                }

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}