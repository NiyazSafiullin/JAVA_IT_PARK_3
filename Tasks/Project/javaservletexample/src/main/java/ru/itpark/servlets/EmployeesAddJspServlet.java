package ru.itpark.servlets;

import ru.itpark.models.Employee;
import ru.itpark.repository.CrudRepository;
import ru.itpark.repository.EmployeeRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EmployeesAddJspServlet extends HttpServlet {
    private EmployeeRepository employeeRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.employeeRepository=(EmployeeRepository)config.getServletContext().getAttribute("EmployeeRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("employee", EmployeeRepository.class);

        req.getRequestDispatcher("/jsp/employee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        double weight = Double.parseDouble(req.getParameter("weight"));
        Long categoryId = Long.parseLong(req.getParameter("categoryId"));

        Employee employee = Employee.builder()
                .name(name)
                  .build();
employeeRepository.save(employee);

        resp.sendRedirect("/users_as_jsp");
    }
}
