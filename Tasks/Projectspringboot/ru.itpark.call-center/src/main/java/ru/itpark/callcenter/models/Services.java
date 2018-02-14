package ru.itpark.callcenter.models;

import lombok.*;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.services.Service;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "services")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String type;
    private String name;
    private String result;
    private Long number;
    private LocalDateTime expiredDate;








}
