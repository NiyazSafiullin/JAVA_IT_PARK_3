package ru.itpark.callcenter.services;


import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.forms.NamesForm;

        import java.util.List;

public interface UsersService {
    List<User> getUsers(String orderBy);

    User getUsers(Long userId);

    void update(Long userId, NamesForm form);
}