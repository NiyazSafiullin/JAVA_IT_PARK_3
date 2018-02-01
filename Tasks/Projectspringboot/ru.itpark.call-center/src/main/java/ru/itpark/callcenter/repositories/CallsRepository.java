package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.Сalls;

import java.util.List;

public interface CallsRepository extends JpaRepository <Сalls, Long> {
   // List<calls> findByOrderByRegistrationTimeDesc();
    List<Сalls> findByOrderById();
 // List<calls> findByOrderByName();


}
