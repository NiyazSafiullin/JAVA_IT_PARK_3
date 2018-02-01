package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.models.Сalls;
import ru.itpark.callcenter.repositories.CallsRepository;

import java.util.List;
@Service
public class CallsServiceImpl implements CallsService {
    @Autowired
    private CallsRepository callsRepository;
    @Override
    public List<Сalls> getCalls(String orderBy) {
        switch (orderBy) {
      //  case "registration_date": return callsRepository.findByOrderByRegistrationTimeDesc();
        case "id": return callsRepository.findByOrderById();
        //case "name": return callsRepository.findByOrderByName();
    }
        return callsRepository.findAll();
}

}