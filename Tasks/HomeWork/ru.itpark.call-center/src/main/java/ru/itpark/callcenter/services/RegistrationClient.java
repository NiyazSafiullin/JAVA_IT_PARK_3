package ru.itpark.callcenter.services;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.RegistrationClients;
@Service
public interface RegistrationClient {
    Long registration(RegistrationClients form);

   // boolean confirm(String confirmString);
}
