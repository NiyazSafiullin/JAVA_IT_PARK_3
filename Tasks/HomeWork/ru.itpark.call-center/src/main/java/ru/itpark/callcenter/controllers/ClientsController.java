package ru.itpark.callcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Client;
import ru.itpark.callcenter.services.ClientService;


import java.util.List;
@Controller
public class ClientsController {
    @Autowired
    private ClientService service;

    @GetMapping(value = "/clients")
    public String getClient(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Client> clients = service.getClients(orderBy);
        model.addAttribute("clients", clients);
        return "clients_page";
    }
    @GetMapping("/clients/{client-id}")
    public String getClientPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("client-id") Long clientId) {
        Client clients=service.getClient(clientId);
        model.addAttribute("clients",clients);
        return "client_page";
    }
    @PostMapping("/clients/{client-id}")

    @ResponseBody
    public ResponseEntity<Object> updateClient(@PathVariable("client-id") Long clientId,
                                             NamesForm form) {
        service.update(clientId, form);

        return ResponseEntity.accepted().build();
    }

}
