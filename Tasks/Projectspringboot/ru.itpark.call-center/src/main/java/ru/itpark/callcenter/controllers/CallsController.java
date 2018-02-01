package ru.itpark.callcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.callcenter.models.Сalls;
import ru.itpark.callcenter.services.CallsService;

import java.util.List;

@Controller
public class CallsController {
    @Autowired
    private CallsService callsService;
    @GetMapping(value = "/calls")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Сalls> calls = callsService.getCalls(orderBy);
        model.addAttribute("calls", calls);
        return "calls_page";
    }
}