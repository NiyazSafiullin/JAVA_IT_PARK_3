package temp;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class RegistrationClientsImpl implements RegistrationClient {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private JavaMailSender javaMailSender;

  //  private PasswordEncoder encoder = new BCryptPasswordEncoder();



    @Override
    @SneakyThrows
    public String registrationClients(RegistrationClients form) {
        LocalDateTime registrationTime = LocalDateTime.now();
        String confirmString = UUID.randomUUID().toString().replace("-","");
        Client newClient= Client.builder()
                .name(form.getName())
                .surname(form.getSurname())
                .email(form.getEmail())
//                .registrationTime(form.getRegistrationTime())
//                .categoriya_zayavki(form.getCategoriya_zayavki())
                .expiredDate(LocalDateTime.now().plusHours(3))
                //.id(form.getId())
               .confirmCode(confirmString)

                .build();

clientRepository.save(newClient);
        String text = "<a href=>Пройдите по ссылке!</a>";

        MimeMessage message = javaMailSender.createMimeMessage();
        message.setContent(text, "text/html");
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setTo(newClient.getEmail());
        messageHelper.setSubject("Подтверждение регистрации");
        messageHelper.setText(text, true);

        javaMailSender.send(message);
        return newClient.getEmail();
    }



//    @Override
//    public boolean confirm(String confirmString) {
//        Optional<Client> clientOptional
//                = clientRepository.findByConfirmCode(confirmString);
//        if (clientOptional.isPresent()) {
//            Client client = clientOptional.get();
//
//            if (LocalDateTime.now().isAfter(client.getExpiredDate())) {
//                return false;
//            }
//
//            client.setConfirmCode(null);
//            client.setExpiredDate(null);
//          //  client.setState(State.CONFIRMED);
//            clientRepository.save(client);
//
//            return true;
//        }
//        return false;
//    }

}
