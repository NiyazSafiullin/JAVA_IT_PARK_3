package temp;

import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.State;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ToString
public class RegistrationCallsForm {
    private Long id;

    private String time;
    private int line;
    private int employee;
    private String talk_time;
    private String hold_time;
    private LocalDateTime registrationTime;
    @Enumerated(value = EnumType.STRING)
    private State state;

}
