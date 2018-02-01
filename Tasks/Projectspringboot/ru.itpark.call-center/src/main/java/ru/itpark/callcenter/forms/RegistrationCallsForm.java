package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;

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
}
