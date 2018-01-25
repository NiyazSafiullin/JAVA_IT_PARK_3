package temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationCallsController {
    @Autowired
   private RegistrationCalls service;

    @PostMapping("/registration_calls")
    public String registrationUser(@ModelAttribute RegistrationCallsForm form,
                                   @ModelAttribute("model") ModelMap model) {
        Long newUserId = service.registration(form);
        model.addAttribute("id", newUserId);
        return "success";

    }



    @GetMapping("/registration_calls")
    public String getRegistrationPage() {
        return "registration_page";
    }


}
