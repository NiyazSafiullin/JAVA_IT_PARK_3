package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.RegistrationCallsForm;
import ru.itpark.callcenter.models.Сalls;
import ru.itpark.callcenter.repositories.CallsRepository;

import java.time.LocalDateTime;
@Service
public class RegistrationCallsImpl implements RegistrationCalls{
  @Autowired
    private CallsRepository callsRepository;

    @Override
    public Long registration(RegistrationCallsForm form) {
        LocalDateTime registrationTime = LocalDateTime.now();
        Сalls newCalls= Сalls.builder()
               .time(form.getTime())
               .line(form.getLine())
                .talk_time(form.getTalk_time())
                .hold_time(form.getHold_time())
                .registrationTime(form.getRegistrationTime())
                .employee(form.getEmployee())
                   //.id(form.getId())
                .build();

       callsRepository.save(newCalls);
        return newCalls.getId();
    }
}
