package ru.itpark.callcenter.forms;
import lombok.Data;
//import temp.Client;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.models.User;

@Data

public class NamesForm {
    private String name;
    private String surname;

    public void update(User user) {
        user.setName(this.name);
        user.setSurname(this.surname);
    }
public void update(Eservice eservice) {
       eservice.setName(this.name);
      // eservice.setSurname(this.surname);

}
//    public void update(Calls calls) {
//        calls.setName(this.name);
//        calls.setSurname(this.surname);
//    }
}