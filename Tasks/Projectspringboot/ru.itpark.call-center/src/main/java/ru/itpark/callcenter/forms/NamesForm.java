package ru.itpark.callcenter.forms;
import lombok.Data;
//import temp.Client;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.services.EServices;

@Data

public class NamesForm {
    private String name;
    private String surname;

    public void update(User user) {
        user.setName(this.name);
        user.setSurname(this.surname);
    }
//public void update(EServices eServices) {
//        eServices.setName(this.name);
//        eServices.setSurname(this.surname);
//
//}
//    public void update(Calls calls) {
//        calls.setName(this.name);
//        calls.setSurname(this.surname);
//    }
}