package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class EmployeesForm {

    private String name;
    private String surname;
    private int position;
}

