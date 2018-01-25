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
public class calls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date time;
    private int line;
    private Date responce_time;
    private int employee;
    private Date talk_time;
    private Date hold_time;
    private LocalDateTime registrationTime;



}
