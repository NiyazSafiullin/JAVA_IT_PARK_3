package ru.itpark.callcenter.services;


import ru.itpark.callcenter.models.User;

        import java.util.List;

public interface UsersService {
    List<User> getUsers(String orderBy);
}