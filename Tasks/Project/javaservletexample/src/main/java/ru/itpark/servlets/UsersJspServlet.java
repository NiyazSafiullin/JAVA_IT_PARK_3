package ru.itpark.servlets;

import ru.itpark.models.User;
import ru.itpark.repository.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersJspServlet extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository)config.getServletContext().getAttribute("usersRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет, Друг!");

        req.setAttribute("users", usersRepository.findAll());
        req.getRequestDispatcher("/jsp/users_with_tags.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");

        String surname=req.getParameter("surname");
        String passport=req.getParameter("passport");
        int position=Integer.parseInt(req.getParameter("position"));
        //int group=Integer.parseInt(req.getParameter("group"));

     //   int age = Integer.parseInt(req.getParameter("age"));

        User user = User.builder()
                .name(name)
.surname(surname)
               // .Date_of_birth(Date_of_birth)
                .passport(passport)
               // .hire_date(hire_date)
               // .date_of_dismissal(date_of_dismissal)
                .position(position)
             //   .group(group)
                //.age(age)
                .build();

        usersRepository.save(user);
        resp.sendRedirect("/users_as_jsp");
    }
}