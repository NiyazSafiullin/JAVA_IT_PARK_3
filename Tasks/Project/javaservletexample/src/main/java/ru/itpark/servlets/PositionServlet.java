package ru.itpark.servlets;

import ru.itpark.models.position;
import ru.itpark.repository.PositionRepository;
import ru.itpark.repository.PositionRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class PositionServlet extends HttpServlet {

    private PositionRepository positionRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");

        this.positionRepository = new PositionRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // берем штуку, в которую можно "вписать ответ"
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.write("<h1>Hello!</h1>");
        writer.write("<table>");
        writer.write("<tr>");
        writer.write("<th>ID</th>");
        writer.write("<th>Имя</th>");

        List<position> positions = positionRepository.findAll();
        for (position position : positions) {
            writer.write("<tr>");
            writer.write("<td>" +position.getId() + "</td>");
            writer.write("<td>" + position.getName() + "</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
    }


}