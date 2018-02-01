package ru.itpark.callcenter.forms;
import lombok.Data;
import ru.itpark.callcenter.models.Client;
import ru.itpark.callcenter.models.User;

import ru.itpark.callcenter.models.*;

@Data

public class NamesForm {
    private String name;
    private String surname;

    public void update(User user) {
        user.setName(this.name);
        user.setSurname(this.surname);
    }
public void update(Client client) {
        client.setName(this.name);
        client.setSurname(this.surname);

}
//    public void update(Calls calls) {
//        calls.setName(this.name);
//        calls.setSurname(this.surname);
//    }
}