package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationServicesForms {
    // private Long id;
    private String name;
    private String category;
    private String result;
    private LocalDateTime registrationTime;
    @Enumerated(value = EnumType.STRING)
    private Role role;
   // private String email;
}