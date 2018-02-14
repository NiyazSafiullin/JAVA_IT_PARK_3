package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.Role;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationForm {
   // private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;
}