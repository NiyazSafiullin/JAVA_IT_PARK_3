package ru.itpark.callcenter.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.repositories.ServicesRepository;
import ru.itpark.callcenter.repositories.UsersRepository;
import ru.itpark.callcenter.repositories.EserviceRepository;

@Component
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UsersRepository usersRepository;
    private ServicesRepository servicesRepository;
   // private EserviceRepository eserviceRepository;

    @Override
    public User getUserByAuthentication(Authentication authentication) {
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }

//    @Override
//    public EServices getEServicesAuthentication(Authentication authentication) {
//        String email = authentication.getName();
//        return eserviceRepository.findByEmail(email).get();
//    }

//    @Override
//    public Service getServicesAuthentication(Authentication authentication) {
//        String email = authentication.getName();
//       // return servicesRepository.findByEmail(email).get();
//        return servicesRepository.findByEmail(email).get();
//    }

//    @Override
//    public EServices getEserviceByAuthentication(Authentication authentication) {
//        String email = authentication.getName();
//        return eserviceRepository.findByOrderById().get();
//    }

//    @Override
//    public Client getClientAuthentication(Authentication authentication) {
//        String email=authentication.getName();
//        return clientRepository.findByEmail(email).get();
//    }

//    @Override
//    public Services getServicesAuthentication(Authentication authentication) {
//        String email=authentication.getName();
//        //return servicesRepository.findByEmail(email).get();
//    }
}