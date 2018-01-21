package dao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
//import dao.EmployessDao;
import models.employess;
import models.service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class EmployessJdbcTemplateDaoImpl implements EmployessDao {
    //language=SQL
    private static final String SQL_INSERT_USER = "INSERT INTO employess(name, kindof_activity, qualification)" +
            "VALUES (?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM employess WHERE " +
            "id = ?";

    //language=SQL
    private static final String SQL_SELECT_USERS = "SELECT * from employess" +
            " LEFT JOIN service ON employess.service_master = service.master;";

    private JdbcTemplate template;


    private Map<Integer, employess> employessMap;

    public EmployessJdbcTemplateDaoImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
        this.employessMap = new HashMap<>();
    }

    private RowMapper<employess> employessRowMapper = new RowMapper<employess>() {
        @Override
        public employess mapRow(ResultSet resultSet, int i) throws SQLException {
                    employess employess = new employess(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("kindof_activity"),
                    resultSet.getString("qualification"));

            //
            if (employessMap.get(employess.getId()) == null) {
                employessMap.put(employess.getId(), employess);
            }




            if (resultSet.getInt(3) != 0) {
                               service service = new service (
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        employessMap.get(resultSet.getInt(9)));
                                int employessid = resultSet.getInt(9);
                              service master = employessMap.get(service);
                master.getemployess().add(service);


            }
            return employess;
        }
    };




    @Override
    public void save(employess model) {
        // задача, сохранить model в базу данных
        // и проставить ей сгенерированный бд id-шник

        // создаем объект, который умеет хранить в себе
        // сгенерированные ключи из бд
        KeyHolder keyHolder = new GeneratedKeyHolder();
        // посылаем запрос на создание пользователя
        template.update(
                // передаем PreparedStatement и KeyHolder
                new PreparedStatementCreator() {
                    // передаете ему connection к БД
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        // Непосредственно создаете PreparedStatement
                        // и говорите, что вам нужен будет id в результате
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_INSERT_USER, new String[] {"id"});
                        // задаете параметры запроса
                        ps.setInt(1, model.getAge());
                        ps.setString(2, model.getName());
                        ps.setString(3, model.getCitizen());
                        return ps;
                    }
                }, keyHolder);

        model.setId(keyHolder.getKey().intValue());
    }

    @Override
    public employess find(int id) {
        return template.queryForObject(SQL_SELECT_USER_BY_ID, employessRowMapper, id);
    }

    @Override
    public List<employess> findAllByAge(int age) {
        return null;
    }

    @Override
    public void update(employess model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<employess> findAll() {
        // мы хотим вытащить всех людей, но люди хранятся не в
        // результате query, а внутри map, где все люди уникальны
        template.query(SQL_SELECT_USERS, employessRowMapper);

        // получим все значения из map
        Collection<employess> employessCollection = employessMap.values();
        List<employess> result = new ArrayList<>(employessCollection);
        // теперь нужно сконвертировать Collection в ArrayList и вернуть
        employessMap.clear();
        return result;
    }

    public List<employess> findAllName(String name) {
        return template.query(SQL_SELECT_USERS, employessRowMapper);
    }
}