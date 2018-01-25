package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findByOrderByRegistrationTimeDesc();
    List<User> findByOrderById();
    List<User> findByOrderByName();
}