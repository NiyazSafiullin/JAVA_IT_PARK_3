package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.models.User;


import java.util.List;
import java.util.Optional;

public interface ServicesRepository extends JpaRepository<Services, Long> {
    List<Services> findByOrderById();
     List<Services> findByOrderByName();
     List<Services> findByOrderByNumber();
     //List<Services> findByOrOrderByCategory();
    //Optional<Services> findByEmail(String email);
}
