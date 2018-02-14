package ru.itpark.callcenter.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.repositories.EserviceRepository;
import ru.itpark.callcenter.forms.EServiceForm;

import java.util.List;
import java.util.UUID;

@Service
public class EServiceImpl implements EServices {
    @Autowired
    private EserviceRepository eserviceRepository;

    @Override
    @SneakyThrows
    public String EServiceForm(EServiceForm form) {
       // String confirmString = UUID.randomUUID().toString().replace("-", "");
        Eservice  neweservices =Eservice.builder()

                .number(form.getNumber())
                .name(form.getName())
               .number(form.getNumber())

                .build();
        eserviceRepository.save(neweservices);
        return neweservices.getName();
    }

    @Override
    public Eservice getEService(Long eserviceId) {
        return eserviceRepository.findOne(eserviceId);
    }


    @Override
    public List<Eservice> getEServices(String orderBy) {
        switch (orderBy) {
           // case "registration_date": return eserviceRepository.findByOrderByRegistrationTimeDesc();
            case "id": return eserviceRepository.findByOrderById();
            case "name": return eserviceRepository.findByOrderByName();
           //case "surname": return eserviceRepository.findByOrderBySurname();
           // case "usluga": return eserviceRepository.findByOrOrderByUsluga();
        }
        return eserviceRepository.findAll();
    }



    @Override
    public void update(Long eserviceId, NamesForm form) {
        Eservice eservice = eserviceRepository.findOne(eserviceId);
        form.update(eservice);
        eserviceRepository.save(eservice);
    }



}
