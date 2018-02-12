package temp;

import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationClients {
    //private Long id;
    private String name;
    private String surname;
    private String password;
    private String email;
//    private LocalDateTime registrationTime;
//    private String categoriya_zayavki;
    @Enumerated(value = EnumType.STRING)
    private Role role;



}
