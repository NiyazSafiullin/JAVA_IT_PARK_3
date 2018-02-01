package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RegistrationForm {
    private String name;
    private String surname;

    private String email;
    private String password;

    private int superviser;
}