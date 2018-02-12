package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.services.Service;

import ru.itpark.callcenter.repositories.ServicesRepository;

import java.util.List;

public class ServiceImpl implements Service {
    @Autowired
    private Service service;
    @Autowired
    private ServicesRepository servicesRepository;
    @Override
    public List<Services> getServices(String orderBy) {
        switch (orderBy) {
           // case "category": return servicesRepository.findByOrderByRegistrationTimeDesc();
            case "id": return servicesRepository.findByOrderById();
            case "name": return servicesRepository.findByOrderByName();
            //case "category" : return servicesRepository.findByOrOrderByCategory();
        }
        return servicesRepository.findAll();
    }


//    @Override
//    public Service getServices(Long servicesId) {
//        return  servicesRepository.findOne(servicesId);
//    }

    @Override
    public void update(Long servicesId, NamesForm form) {

    }


}
