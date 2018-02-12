package temp;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.callcenter.models.eservice;

import java.util.List;

public interface CallsRepository extends JpaRepository <eservice, Long> {
    List<eservice> findByOrderByRegistrationTimeDesc();
    List<eservice> findByOrderById();
 //List<eservice> findByOrderByName();
// Optional<eservice> findByConfirmCode(String confirmCode);



}
