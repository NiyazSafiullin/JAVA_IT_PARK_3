package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.models.User;

import java.util.List;
import java.util.Optional;

public interface EserviceRepository extends JpaRepository <Eservice, Long> {
    List<Eservice> findByOrderById();
  List<Eservice> findByOrderByName();
    //Optional<Eservice> findByEmail(String email);
   // List<Eservice> findByOrderByNumber();
    List<Eservice> findByOrderByRegistrationTimeDesc();
    //List<Eservice> findByOrOrderByUsluga();

}
