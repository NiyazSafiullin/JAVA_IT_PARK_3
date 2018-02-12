package temp;

import lombok.*;
import ru.itpark.callcenter.models.Role;
import ru.itpark.callcenter.models.State;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDateTime registrationTime;
    private String categoriya_zayavki;
    private String confirmCode;

    private LocalDateTime expiredDate;



    private String hashPassword;



    @Enumerated(value = EnumType.STRING)
    private State state;

    @Enumerated(value = EnumType.STRING)
    private Role role;

}
