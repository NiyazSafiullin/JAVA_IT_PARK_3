package ru.itpark.callcenter.models;

import lombok.*;
import ru.itpark.callcenter.services.EServices;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "eservice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Eservice  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  // private String usluga;
//    private String email;
    private Long id;
    private String name;
    private Long number;
    private LocalDateTime registrationTime;

 //private int employee;
   // private LocalDateTime registrationTime;
//    @Enumerated(value = EnumType.STRING)
//    private State state;
   // private Date date;


}
