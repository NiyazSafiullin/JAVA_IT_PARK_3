package ru.itpark.repository;

import ru.itpark.models.Employee;
import ru.itpark.models.User;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private EntityManager entityManager;
    @Override
    public List<Employee> findAllByCategory(String category) {
        return null;

    }

//    @Override
//    public List<Employee> findAll() {
//        return null;
//    }

    @Override
    public List<Employee> findAll() {
return null;
    }

    @Override
    public void save(Employee model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }
}
