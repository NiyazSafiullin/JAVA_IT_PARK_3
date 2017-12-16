package models;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class service {
    private int id;
    private String department;
    private String status;
    private String master;

}