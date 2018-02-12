package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import lombok.SneakyThrows;
import ru.itpark.callcenter.forms.RegistrationServicesForms;
import ru.itpark.callcenter.models.Services;

import ru.itpark.callcenter.repositories.ServicesRepository;

import javax.mail.internet.MimeMessage;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RegistrationServicesImpl implements RegistrationServices {
    @Autowired
    private ServicesRepository servicesRepository;
    @Autowired
    private JavaMailSender javaMailSender;


    @Override
    @SneakyThrows
    public String registrationServices(RegistrationServicesForms form) {
        Services newServices = Services.builder()
                .category(form.getCategory())
                .result(form.getResult())
                //.email(form.getEmail())
                .name(form.getName())


                .build();

        servicesRepository.save(newServices);



         return newServices.getCategory();
    }

    @Override
    public Services getServices(Long servicesId) {
        return servicesRepository.findOne(servicesId);
    }

    @Override
    public List<Services> getServices(String orderBy) {
        switch (orderBy) {
           // case "registration_date": return servicesRepository.findByOrderByRegistrationTimeDesc();
            case "id": return servicesRepository.findByOrderById();
            case "name": return servicesRepository.findByOrderByName();
       //     case "category": return servicesRepository.findByOrOrderByCategory();

        }
        return servicesRepository.findAll();
    }

}


