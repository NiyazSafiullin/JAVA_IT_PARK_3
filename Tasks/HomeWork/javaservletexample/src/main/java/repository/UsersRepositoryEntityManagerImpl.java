package repository;

import models.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UsersRepositoryEntityManagerImpl implements UsersRepository {

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