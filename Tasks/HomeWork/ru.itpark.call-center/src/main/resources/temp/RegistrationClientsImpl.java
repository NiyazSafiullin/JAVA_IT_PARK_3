package ru.itpark.callcenter.services;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.RegistrationClients;
import ru.itpark.callcenter.models.Client;
import ru.itpark.callcenter.models.State;
import ru.itpark.callcenter.repositories.ClientRepository;


import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


import ru.itpark.callcenter.repositories.ClientRepository;
import ru.itpark.callcenter.repositories.UsersRepository;
import ru.itpark.callcenter.services.RegistrationClient;

import java.time.LocalDateTime;
import java.util.Optional;
import javax.mail.internet.MimeMessage;
import java.util.UUID;
@Service
public class RegistrationClientsImpl implements RegistrationClient {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Long registration(RegistrationClients form) {
        LocalDateTime registrationTime = LocalDateTime.now();
        Client newClient= Client.builder()
                .name(form.getName())
                .surname(form.getSurname())
                //.confirmCode(confirmString)
                .email(form.getEmail())
                .registrationTime(form.getRegistrationTime())
                .build();
        clientRepository.save(newClient);


//        String text = "<a href=\"localhost/confirm/" +newClient.getConfirmCode()+ "\">Пройдите по ссылке</a>";
//
//        MimeMessage message = javaMailSender.createMimeMessage();
//        message.setContent(text, "text/html");
//        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
//        messageHelper.setTo(newClient.getEmail());
//        messageHelper.setSubject("Подтверждение регистрации");
//        messageHelper.setText(text, true);
//
//        javaMailSender.send(message);
        return newClient.getId();
    }
//    @Override
//    public boolean confirm(String confirmString) {
//        Optional<Client> clientOptional
//                = clientRepository.findByConfirmCode(confirmString);
//        if (clientRepository.isPresent()) {
//            Client client = clientOptional.get();
//
//            if (LocalDateTime.now().isAfter(client.getExpiredDate())) {
//                return false;
//            }
//
//            client.setConfirmCode(null);
//            client.setExpiredDate(null);
//            client.setState(State.CONFIRMED);
//            clientRepository.save(client);
//
//            return true;
//        }
//        return false;
    //}

}
