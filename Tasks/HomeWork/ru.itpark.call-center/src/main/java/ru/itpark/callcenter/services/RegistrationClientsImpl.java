package ru.itpark.callcenter.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.callcenter.forms.RegistrationClients;
import ru.itpark.callcenter.models.Role;
import ru.itpark.callcenter.models.State;
import ru.itpark.callcenter.models.Client;

import ru.itpark.callcenter.repositories.ClientRepository;
import ru.itpark.callcenter.services.RegistrationClient;

import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class RegistrationClientsImpl implements RegistrationClient {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public String registrationClients(RegistrationClients form) {
        return null;
    }

    //private PasswordEncoder encoder = new BCryptPasswordEncoder();
}

//    @Override
//    @SneakyThrows
//    public String registrationClients(RegistrationClients form) {
//        //String hashPassword = encoder.encode(form.getPassword());
//        LocalDateTime registrationTime = LocalDateTime.now();
//        String confirm2String = UUID.randomUUID().toString().replace("-", "");
//        Client newClient = Client.builder()
//                .name(form.getName())
//                .surname(form.getSurname())
//                .email(form.getEmail())
//                .registrationTime(form.getRegistrationTime())
//                .categoriya_zayavki(form.getCategoriya_zayavki())
//                .expiredDate(LocalDateTime.now().plusHours(3))
//                .id(form.getId())
//
//                .build();


//        String text = "<a href=\"localhost/confirm2/" +newClient.getConfirmCode()+ "\">Пройдите по ссылке</a>";
//
//        MimeMessage message = javaMailSender.createMimeMessage();
//        message.setContent(text, "text/html");
//        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
//        messageHelper.setTo(newClient.getEmail());
//        messageHelper.setSubject("Подтверждение регистрации");
//        messageHelper.setText(text, true);
//
//        javaMailSender.send(message);
//        return newClient.getEmail();


//    @Override
//    public boolean confirm2(String confirm2String) {
//        Optional<Client> clientOptional
//                = clientRepository.findByConfirm2Code(confirm2String);
//        if (clientOptional.isPresent()) {
//            Client client = clientOptional.get();
//
//            if (LocalDateTime.now().isAfter(client.getExpiredDate())) {
//                return false;
//            }
//
//            client.setConfirm2Code(null);
//            client.setExpiredDate(null);
//            client.setState(State.CONFIRMED);
//            clientRepository.save(client);
//
//            return true;
//        }
//        return false;
//    }


