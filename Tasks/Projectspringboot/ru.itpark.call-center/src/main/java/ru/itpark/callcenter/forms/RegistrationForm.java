package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.callcenter.models.Role;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationForm {
 private String name;
 private String surname;
 private String email;
 private String password;
 private Long number;
 private String result;
 @Enumerated(value = EnumType.STRING)
 private Role role;
}