package dao;

import java.util.List;
import models.employess;
public interface EmployessDao extends CrudDao<employess> {
    List<employess> findAllByAge(int age);

    void update(employess model);

    void delete(int id);

    List<employess> findAllName(String name);

}
