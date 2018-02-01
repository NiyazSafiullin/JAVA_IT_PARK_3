package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Client;
import ru.itpark.callcenter.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> getClients(String orderBy) {
        switch (orderBy) {
          case "registration_date": return clientRepository.findByOrderByRegistrationTimeDesc();
        case "id": return clientRepository.findByOrderById();
        case "name": return clientRepository.findByOrderByName();
    }
        return clientRepository.findAll();
}

    @Override
    public Client getClient(Long clientId) {
        return clientRepository.findOne(clientId);

    }


    @Override
    public void update(Long clientId, NamesForm form) {
       Client client=clientRepository.findOne(clientId);
       form.update(client);
        clientRepository.save(client);
    }

}