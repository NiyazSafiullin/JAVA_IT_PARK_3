package ru.itpark.callcenter.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@ToString
public class RegistrationCallsForm {
    private Long id;

    private Date time;
    private int line;
    private Date responce_time;
    private int employee;
    private Date talk_time;
    private Date hold_time;
    private LocalDateTime registrationTime;
}
