package main.dao;

import main.dao.CrudDao;
import main.models.Car;
import main.models.Human;

import java.util.List;

public interface HumansDao extends CrudDao<Human> {
    List<Human> findAllByAge(int age);

    List<Car> findAllModel(String model);

    void save(Car model);

    void update(Car model);

    List<Car> findAllModel();
}