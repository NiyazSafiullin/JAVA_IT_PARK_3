package ru.itpark.callcenter.controllers;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.forms.RegistrationServicesForms;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.services.RegistrationServices;
import ru.itpark.callcenter.services.Service;
import ru.itpark.callcenter.services.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class ServicesController {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private RegistrationServices registrationServices;
    @GetMapping(value = "/services")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Services> services = registrationServices.getServices(orderBy);
        model.addAttribute("services", services);
        return "service_page";
    }



//    @GetMapping(value = "/usersearch")
//    public String getSearchePage(Authentication authentication,
//            @ModelAttribute("model") ModelMap model) {
//        if (authentication != null) {
//            Service service = authenticationService.getServicesAuthentication(authentication);
//            model.addAttribute("service", service);
//
//        }
//        return "search_user";
//    }






    @PostMapping("/addServices")
    public String addServices(@ModelAttribute RegistrationServicesForms form,
                              @ModelAttribute("model") ModelMap model) {
        String email =registrationServices.registrationServices(form);
        model.addAttribute("email", email);
        return "add_services";


    }

    @GetMapping("/addServices")
    public String addServices() {
        return "add_services2";
    }
//    @GetMapping("/services/{service-id}")
//    public String getServicesPage(@ModelAttribute("model") ModelMap model,
//                              @PathVariable("service-id") Long servicesId) {
//        Service service1=service2.getServices(servicesId);
//        model.addAttribute("services", service2);
//        return "services_page";
//    }
//
//    @PostMapping("/services/{services-id}")
//    @ResponseBody
//    public ResponseEntity<Object> updateUser(@PathVariable("services-id") Long servicesId,
//                                             NamesForm form) {
//        service2.update(servicesId, form);
//        return ResponseEntity.accepted().build();
//    }

}
