package ru.itpark.callcenter.services;

import org.springframework.security.core.Authentication;
//import temp.Client;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.models.User;

public interface AuthenticationService {
    User getUserByAuthentication(Authentication authentication);
//    Client getClientAuthentication(Authentication authentication);

   // Services getServicesAuthentication(Authentication authentication);


    //EServices getEServicesAuthentication(Authentication authentication);
//    EServices getEserviceByAuthentication(Authentication authentication);



}