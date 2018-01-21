package main.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import main.models.Car;
import main.models.Human;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Реализция HumansDao с помощью JdbcTemplate
 */
public class CarsDaojdbsTemplateImpl implements CarsDao {
    //language=SQL
    private static final String SQL_INSERT_USER = "SELECT * FROM  car where" +
            "id= ?";

//    //language=SQL
//    private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM owner " +
//            "WHERE owner.id = ?";
//
//    //language=SQL
//    private static final String SQL_SELECT_USERS = "SELECT * from owner" +
//            " LEFT JOIN car ON owner.id = car.owner_id;";

    // Пришел из библиотеки spring-jdbc
    // содержит в себе шаблонные методы для работы с данными
    // update, query, queryForObject
    private JdbcTemplate template;

    // мап, где ключ - id, значение - человек
    private Map<Integer, Human> humansMap;

    public CarsDaojdbsTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
//        humansMap = new HashMap<>();
    }

    // один из вариантов RowMapper, который описывает
    // отображение строки из бд в java-объект
    private RowMapper<Car> carRowMapper = (resultSet, i) -> Human.builder()
            .id(resultSet.getInt("id"))
            .age(resultSet.getInt("age"))
            .name(resultSet.getString("name"))
            .citizen(resultSet.getString("citizen"))
            .build();

    // вариант с машинами
    private RowMapper<Car> carRowMapperWithCars = new RowMapper<Car>() {
        @Override
        public Car mapRow(ResultSet resultSet, int i) throws SQLException {
            // отображаю строку в человека
            Car car = carRowMapper.mapRow(resultSet, i);
           car.setCars(new ArrayList<>());
            // сейчас я нахожусь на какой-либо строке
            // результирующего множества строк

            // тут я в двух ситуациях - либо этот человек
            // мне встречался, либо нет

            // у меня есть мап ID(ключ)-Человек(значение)
            //
//            if (carMap.get(car.getId()) == null) {
//                humansMap.put(car.getId(), car);
//            }

            // в результирующем множестве все колонки
            // для машины начиются с номера 5

            // если у данного пользователя есть машина
            if (resultSet.getInt(5) != 0) {
                // отображем строку в машину
                Car car = new Car(
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                       CarMap.get(resultSet.getInt(9)));
                // вытаскиваем id хозяина данной машины
                int ownerId = resultSet.getInt(9);
                // берем хозяина по его id
                Human owner = humansMap.get(ownerId);
                // беру список его машин и кидаю туда новую машину
                owner.getCars().add(car);
            }
            return car;
        }
    };

    @Override
    public List<Car> findAllModel(String model) {
        return null;
    }

    @Override
    public List<Car> findAllColor(String color) {
        return null;
    }

    @Override
    public List<Car> findOwnerId(int ownerId) {
        return null;
    }



    @Override
    public void save(Car model) {

    }

    @Override
    public Car find(int id) {
        return null;
    }

    @Override
    public void update(Car model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}
