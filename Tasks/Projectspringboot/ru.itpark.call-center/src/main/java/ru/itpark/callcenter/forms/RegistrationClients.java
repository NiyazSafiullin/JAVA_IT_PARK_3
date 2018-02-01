package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationClients {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDateTime registrationTime;
}
