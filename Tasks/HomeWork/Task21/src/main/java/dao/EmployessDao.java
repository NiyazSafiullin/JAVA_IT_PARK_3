package dao;

import java.util.List;
import models.employess;
public interface EmployessDao extends CrudDao<employess> {
List<employess> findAllname(String name);

}
