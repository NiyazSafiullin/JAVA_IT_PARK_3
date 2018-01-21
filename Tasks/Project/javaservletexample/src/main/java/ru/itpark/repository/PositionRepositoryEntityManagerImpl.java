package ru.itpark.repository;

import ru.itpark.models.User;
import ru.itpark.models.position;

import javax.persistence.EntityManager;
import java.util.List;

public class PositionRepositoryEntityManagerImpl implements PositionRepository {

    private EntityManager entityManager;

    public PositionRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<position> findAll() {
        return entityManager
                .createQuery("from position position order by position.id", position.class)
                .getResultList();
    }

    @Override
    public void save(position model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }
}
