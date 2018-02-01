package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.Client;

import java.util.List;
import java.util.*;

public interface ClientRepository extends JpaRepository <Client, Long> {
     List<Client> findByOrderByRegistrationTimeDesc();
    List<Client> findByOrderById();
     List<Client> findByOrderByName();
    Optional<Client> findByConfirmCode(String confirmCode);

}