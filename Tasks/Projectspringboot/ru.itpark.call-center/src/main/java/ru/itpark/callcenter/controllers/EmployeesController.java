package ru.itpark.callcenter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.EmployeesForm;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.models.Employee;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.services.AuthenticationService;
import ru.itpark.callcenter.services.RegistrationServices;
import ru.itpark.callcenter.services.EmployeeService;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Controller
public class EmployeesController {
@Autowired
    private EmployeeService employeeService;


    @PostMapping("/addEmployees")
    public String addEmployee(@ModelAttribute EmployeesForm form,
                              @ModelAttribute("model") ModelMap model) {
        String email =employeeService.EmployeesForm(form);
        model.addAttribute("email", email);
        return "add_employees";


    }
    @GetMapping(value = "/Employees")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Employee> employees = employeeService.getEmployees(orderBy);
        model.addAttribute("employees", employees);
        return "Employees_page";
    }

    @GetMapping("/addEmployees")
    public String addEmployee() {
        return "add_employees2";
    }


}
