package ru.itpark.callcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.RegistrationForm;
import ru.itpark.callcenter.forms.RegistrationClients;
import ru.itpark.callcenter.services.RegistrationService;
import ru.itpark.callcenter.services.RegistrationClient;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;
    @Autowired
    private RegistrationClient servise;

    @PostMapping("/registration")
    public String registrationUser(@ModelAttribute RegistrationForm form,
                                   @ModelAttribute("model") ModelMap model) {
        String email = service.registration(form);
        model.addAttribute("email", email);
        return "success";


    }

    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration_page";
    }

//    @PostMapping("/registrationClients")
//    public String registrationClient(@ModelAttribute RegistrationClients form,
//                                   @ModelAttribute("model") ModelMap model) {
//        String email = servise.registrationClients(form);
//        model.addAttribute("email", email);
//        return "success_client";
//
//
//    }
//
//    @GetMapping("/registrationClients")
//    public String getRegistrationClients() {
//        return "registration_challenge";
//    }

    @GetMapping("/confirm/{confirm-string}")
    public String getConfirmPage(
            @ModelAttribute("model") ModelMap model,
            @PathVariable("confirm-string") String confirmString) {
        boolean result = service.confirm(confirmString);

        model.addAttribute("result", result);
        return "confirm_result_page";
    }
//    @GetMapping("/confirm2/{confirm2-string}")
//    public String getConfirm2Page(
//            @ModelAttribute("model") ModelMap model,
//            @PathVariable("confirm2-string") String confirm2String) {
//        boolean result = servise.confirm2(confirm2String);
//
//        model.addAttribute("result", result);
//        return "confirm2_result_page";
//    }
    @GetMapping("/login")
    public String login(
            @ModelAttribute("model") ModelMap model,
            @RequestParam(value = "error", required = false) Boolean error) {
        if (error != null) {
            model.addAttribute("error", true);
        } else {
            model.addAttribute("error", false);
        }
        return "login";
    }
}
