package ru.itpark.servlets;

import ru.itpark.models.User;
import ru.itpark.repository.UsersRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class EmployeesServlet extends HttpServlet {
    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");

        this.usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
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
        writer.write("<th>Возраст</th>");
        writer.write("</tr>");

        List<User> users = usersRepository.findAll();
        for (User user : users) {
            writer.write("<tr>");
            writer.write("<td>" + user.getId() + "</td>");
            writer.write("<td>" + user.getName() + "</td>");
            //writer.write("<td>" + user.getAge() + "</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
    }

    public static class UsersRepositoryEntityManagerImpl implements UsersRepository {

        private EntityManager entityManager;

        public UsersRepositoryEntityManagerImpl(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        @Override
        public List<User> findAll() {
            return entityManager
                    .createQuery("from User user order by user.id", User.class)
                    .getResultList();
        }

        @Override
        public void save(User model) {
            entityManager.getTransaction().begin();
            entityManager.persist(model);
            entityManager.getTransaction().commit();
        }
    }
}

