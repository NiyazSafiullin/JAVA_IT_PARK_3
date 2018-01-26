package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.calls;

import java.util.List;

public interface CallsRepository extends JpaRepository <calls, Long> {
   // List<calls> findByOrderByRegistrationTimeDesc();
    List<calls> findByOrderById();
    //List<calls> findByOrderByName();


}
