package ru.itpark.callcenter.services;


import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.EmployeesForm;
import ru.itpark.callcenter.models.Role;
import ru.itpark.callcenter.models.State;
import ru.itpark.callcenter.models.Employee;

import ru.itpark.callcenter.repositories.EmployeeRepository;
import ru.itpark.callcenter.services.EmployeeService;

import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @SneakyThrows
    public String EmployeesForm(EmployeesForm form) {


            String confirmString = UUID.randomUUID().toString().replace("-", "");

            Employee newEmployee = Employee.builder()

                   .name(form.getName())
                    .surname(form.getSurname())
                    .build();

            employeeRepository.save(newEmployee);
        return newEmployee.getName();
        }

    @Override
    public List<Employee> getEmployees(String orderBy) {
        switch (orderBy) {
            // case "category": return servicesRepository.findByOrderByRegistrationTimeDesc();
            case "id": return employeeRepository.findByOrderById();
            case "name": return employeeRepository.findByOrderByName();
            case "surname" : return employeeRepository.findByOrderBySurname();
        }
        return employeeRepository.findAll();
    }



}
