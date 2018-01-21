import dao.EmployessDao;

import dao.EmployessJdbcTemplateDaoImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



import dao.EmployessJdbcTemplateDaoImpl;

public class Main {

    public static void main(String[] args) {
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       // System.out.println("Context loaded");
    //    EmployessDaoJdbcImpl employessDaoJdbc=context.getBean();
        EmployessJdbcTemplateDaoImpl employessJdbcTemplateDao=context.getBean(EmployessJdbcTemplateDaoImpl.class);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("Zaq12wsx");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/safiullin_nh");
EmployessDao employessDao=new EmployessJdbcTemplateDaoImpl(dataSource);
employessDao.findAllName("Нияз");

    }

}
