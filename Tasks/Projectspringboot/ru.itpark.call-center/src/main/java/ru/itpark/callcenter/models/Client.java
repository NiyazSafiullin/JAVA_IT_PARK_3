package ru.itpark.callcenter.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String confirmCode;
    private LocalDateTime registrationTime;
    private String hashPassword;


    private LocalDateTime expiredDate;

//    @Enumerated(value = EnumType.STRING)
//    private State state;
//
//    @Enumerated(value = EnumType.STRING)
//    private Role role;

//    @Enumerated(value = EnumType.STRING)
//    private State state;

}
