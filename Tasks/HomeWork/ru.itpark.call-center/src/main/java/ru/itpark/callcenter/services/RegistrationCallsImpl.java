package ru.itpark.callcenter.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.RegistrationCallsForm;
import ru.itpark.callcenter.models.calls;
import ru.itpark.callcenter.repositories.CallsRepository;

import java.time.LocalDateTime;
@Service
public class RegistrationCallsImpl implements RegistrationCalls{
  @Autowired
  private CallsRepository callsRepository;

    @Override
    public Long registration(RegistrationCallsForm form) {
        LocalDateTime registrationTime = LocalDateTime.now();
        calls newCalls= calls.builder()
               .time(form.getTime())
               .line(form.getLine())
                .responce_time(form.getResponce_time())
                   .id(form.getId())
                .build();

       callsRepository.save(newCalls);
        return newCalls.getId();
    }
}
