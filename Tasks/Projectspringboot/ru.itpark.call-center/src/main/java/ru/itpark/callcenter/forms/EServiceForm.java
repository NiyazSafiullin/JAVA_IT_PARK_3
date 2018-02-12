package ru.itpark.callcenter.forms;
import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.State;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ToString

public class EServiceForm {
//private int id;

   private String usluga;
    private String name;
    private Long number;
   private LocalDateTime registrationTime;

}
