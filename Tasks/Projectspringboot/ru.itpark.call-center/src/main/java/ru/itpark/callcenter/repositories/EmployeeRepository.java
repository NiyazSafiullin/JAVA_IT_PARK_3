package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.Employee;

import java.util.List;


public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    List<Employee> findByOrderById();
    List<Employee> findByOrderByName();
    List<Employee> findByOrderBySurname();
    List<Employee> findByOrderByPosition();
}
