package ru.itpark.callcenter.services;

import org.springframework.security.core.Authentication;
import ru.itpark.callcenter.models.User;

public interface AuthenticationService {
    User getUserByAuthentication(Authentication authentication);
}