package ru.itpark;

import ru.itpark.repository.UsersRepository;
import ru.itpark.servlets.EmployeesServlet;
import ru.itpark.repository.PositionRepository;
import ru.itpark.servlets.PositionServlet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");

        UsersRepository usersRepository = new EmployeesServlet.UsersRepositoryEntityManagerImpl(factory.createEntityManager());

        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);

        UsersRepository positionRepository = new EmployeesServlet.UsersRepositoryEntityManagerImpl(factory.createEntityManager());

        servletContextEvent.getServletContext().setAttribute("positionRepository", positionRepository);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
