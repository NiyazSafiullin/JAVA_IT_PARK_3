package ru.itpark.callcenter.forms;



import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
@Data
@ToString
public class MainForm {
    private String type;
    private String result;
    private LocalDate departureDate;
}