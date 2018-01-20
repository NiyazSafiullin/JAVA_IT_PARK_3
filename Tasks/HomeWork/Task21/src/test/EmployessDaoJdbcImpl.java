package dao;

import models.employess;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployessDaoJdbcImpl implements EmployessDao {
private Connection connection;

public EmployessDaoJdbcImpl(DataSource dataSource) {
    try {
        connection=dataSource.getConnection();
    } catch (SQLException e) {
       throw new IllegalStateException(e);
    }
}



    public EmployessDaoJdbcImpl(String text) {
        System.out.println(EmployessDaoJdbcImpl.class);
    }




    public void save(employess name) {

    }

    public employess find(int id)  {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM employess WHERE employess.id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            employess employess = null;
            while (resultSet.next()) employess = models.employess.builder()
                    .id(resultSet.getInt("id"))
                    .name(resultSet.getString("name"))
                    .kindof_activity(resultSet.getString("kindof_activity"))
                    .build();
            if (employess == null) {
                throw new IllegalArgumentException("Employess with id <" + id + "> not found");
            } else return null;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
      }
    }


    public List<employess> findAll() {
        return null;
    }

    public List<employess> findAllName(String name) {
        return null;
    }
}
