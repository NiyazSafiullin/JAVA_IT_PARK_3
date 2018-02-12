package ru.itpark.callcenter.controllers;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.services.AuthenticationService;
import ru.itpark.callcenter.services.RegistrationServices;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.callcenter.forms.EServiceForm;
import ru.itpark.callcenter.services.EServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.services.Service;

import java.util.List;

@Controller
public class EServiceController {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private EServices eServices;
    @GetMapping(value = "/eservices")
    public String getEServices(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Eservice> eservices = eServices.getEServices(orderBy);
        model.addAttribute("eservices", eservices);
        return "eservices_page";
    }

        @PostMapping("/addEService")
    public String addEService(@ModelAttribute EServiceForm form,
                              @ModelAttribute("model") ModelMap model) {
        Long email = eServices.EServiceForm(form);
        model.addAttribute("email", email);
        return "add_eservice";


    }

    @GetMapping("/addEService")
    public String addEService() {
        return "add_eservice2";
    }


//    @GetMapping(value = "/eservicesearch")
//    public String getSearchePage(Authentication authentication,
//            @ModelAttribute("model") ModelMap model) {
//        if (authentication != null) {
//            Eservice eservice = authenticationService.getEServicesAuthentication(authentication);
//            model.addAttribute("eservice", eservice);
//
//        }
//        return "search_user";
    }