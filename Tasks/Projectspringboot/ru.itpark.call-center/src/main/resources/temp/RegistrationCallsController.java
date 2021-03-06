package temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.callcenter.services.CallsService;
import ru.itpark.callcenter.services.RegistrationCalls;


@Controller
public class RegistrationCallsController {
    @Autowired
    private RegistrationCalls services;

    @PostMapping("/registrationcalls")
    public String registrationUser(@ModelAttribute RegistrationCallsForm form,
                                   @ModelAttribute("model") ModelMap model) {
        Long newCallsId = services.registration(form);
        model.addAttribute("id", newCallsId);
        return "success_calls";

    }


    @GetMapping("/registrationcalls")
    public String getRegistrationPage() {
        return "registration_calls";
    }


}
