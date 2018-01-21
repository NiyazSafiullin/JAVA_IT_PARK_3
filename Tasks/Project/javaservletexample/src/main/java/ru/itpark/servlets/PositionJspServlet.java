package ru.itpark.servlets;

import ru.itpark.models.User;
import ru.itpark.models.position;
import ru.itpark.repository.PositionRepository;
import ru.itpark.repository.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PositionJspServlet extends HttpServlet {

    private PositionRepository positionRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.positionRepository = (PositionRepository)config.getServletContext().getAttribute("positionRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет, Друг!");

        req.setAttribute("users", positionRepository.findAll());
        req.getRequestDispatcher("/jsp/position_with_tags.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //int id=Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        position position = ru.itpark.models.position.builder()
              //  .id(id)
                .name(name)
                .build();

        positionRepository.save(position);
        resp.sendRedirect("/position_as_jsp");
    }
}