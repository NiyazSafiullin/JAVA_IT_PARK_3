package ru.itpark.callcenter.models;

import lombok.*;
import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "calls")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Сalls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

    private String time;
    private int line;
    private int employee;
    private String talk_time;
    private String hold_time;
    private LocalDateTime registrationTime;
    @Enumerated(value = EnumType.STRING)
    private State state;


}
