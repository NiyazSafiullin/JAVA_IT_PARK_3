package main.dao;

import main.models.Car;

import java.util.List;

public interface CarsDao extends CrudDao<Car> {
  List<Car> findAllModel (String model);

  List<Car> findAllColor(String color);

  List<Car> findOwnerId(int ownerId);
}
