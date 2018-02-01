package ru.itpark.callcenter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.Сalls;

import java.util.List;
import java.util.Optional;

public interface CallsRepository extends JpaRepository <Сalls, Long> {
    List<Сalls> findByOrderByRegistrationTimeDesc();
    List<Сalls> findByOrderById();
 //List<Сalls> findByOrderByName();
// Optional<Сalls> findByConfirmCode(String confirmCode);



}
