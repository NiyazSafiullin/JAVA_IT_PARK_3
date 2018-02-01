package ru.itpark.callcenter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Сalls;
import ru.itpark.callcenter.services.CallsService;

import java.util.List;

@Controller
public class CallsController {
    @Autowired
    private CallsService callsService;
    @GetMapping(value = "/calls")
    public String getCalls(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Сalls> calls = callsService.getCalls(orderBy);
        model.addAttribute("calls", calls);
        return "calls_page";
    }
    @GetMapping("/calls/{calls-id}")
    public String getCallspage(@ModelAttribute("model")ModelMap model,
    @PathVariable("calls-id") Long callsId) {
        Сalls calls = callsService.getCalls(callsId);
        model.addAttribute("calls ", calls);
        return "call_page";
    }

//    @PostMapping("/calls/{call-id}")
//    @ResponseBody
//    public ResponseEntity<Object> updateCalls(@PathVariable("calls-id") Long callsId,
//                                              NamesForm form) {
//
//        //callsService.update(callsId, form);
//        return ResponseEntity.accepted().build();
//    }

}
