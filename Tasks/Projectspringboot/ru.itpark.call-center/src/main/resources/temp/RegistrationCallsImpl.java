package temp;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itpark.callcenter.models.calls;
import ru.itpark.callcenter.repositories.CallsRepository;

import java.time.LocalDateTime;

public abstract class RegistrationCallsImpl implements RegistrationCalls{
  @Autowired
  private CallsRepository callsRepository;

    //@Override
    public Long registration(RegistrationCallsForm form) {
        LocalDateTime registrationTime = LocalDateTime.now();
        calls newCalls= calls.builder()
                .time(form.getTime())
                .line(form.getLine())
                .responce_time(form.getResponce_time())

                .build();

       callsRepository.save(newCalls);
        return newCalls.getId();
    }
}
