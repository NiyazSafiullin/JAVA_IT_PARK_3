package main.dao;
import java.util.*;
import java.sql.*;

import main.models.Car;
import main.models.Human;

public class HumansDaoJdbcImpl implements HumansDao {

    public Connection connect() throws SQLException {
        String name = "postgres";
        String password = "Zaq12wsx";
        String url = "jdbc:postgresql://localhost:5432/safiullin_nh";
        return DriverManager.getConnection(url, name, password);
    }

    @Override
    public Human find(int id) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM owner WHERE owner.id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Human human = null;
            while (resultSet.next()) {
                human = Human.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .age(resultSet.getInt("age"))
                        .citizen(resultSet.getString("citizen"))
                        .build();
            }
            if (human == null) {
                throw new IllegalArgumentException("User ne naiden");
            } else return human;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Human> findAllByAge(int age) {
        return null;
    }

    @Override
    public List<Car> findAllModel(String model) {
        return null;
    }

    @Override
    public void save(Car model) {

    }

    @Override
    public void update(Car model) {

    }

    @Override
    public List<Car> findAllModel() {
        return null;
    }

    @Override
    public void save(Human model) {

    }

    @Override
    public void update(Human model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Human> findAll() {
        return null;
    }
}
