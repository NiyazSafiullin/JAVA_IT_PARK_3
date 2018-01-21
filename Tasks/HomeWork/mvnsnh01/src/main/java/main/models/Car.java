package main.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(exclude = "owner")
@ToString(exclude = "owner")
public class Car {
    private int id;
    private String number;
    private String color;
    private String model;
    private Human owner;

}
