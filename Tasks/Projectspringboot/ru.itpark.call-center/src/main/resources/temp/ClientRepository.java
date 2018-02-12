package temp;

import org.springframework.data.jpa.repository.JpaRepository;
import temp.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository <Client, Long> {
     List<Client> findByOrderByRegistrationTimeDesc();
    List<Client> findByOrderById();
     List<Client> findByOrderByName();
    Optional<Client> findByConfirmCode(String confirmCode);
    Optional<Client> findByEmail(String email);


}