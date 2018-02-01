package ru.itpark.callcenter.services;

import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Client;

import java.util.List;

public interface ClientService {
     List<Client> getClients(String orderBy);


     Client getClient(Long clientId);

     void update(Long clientId, NamesForm form);
}
