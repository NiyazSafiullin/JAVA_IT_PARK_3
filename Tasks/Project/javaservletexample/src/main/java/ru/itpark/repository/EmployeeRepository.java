package ru.itpark.repository;



import ru.itpark.models.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee> {
    List<Employee> findAllByCategory(String category);
}