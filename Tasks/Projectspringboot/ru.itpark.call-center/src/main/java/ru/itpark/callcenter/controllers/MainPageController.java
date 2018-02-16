package ru.itpark.callcenter.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.models.Eservice;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.services.AuthenticationService;
import ru.itpark.callcenter.services.EServices;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainPageController {
    @Autowired
    private AuthenticationService authenticationService;
@Autowired
    EServices eServices;
    @GetMapping("/")
    public String getMain(Authentication authentication,
                              @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main_page";
    }
    @GetMapping("/authorization")
    public String getMainPage(Authentication authentication,
                              @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main";
    }
    @GetMapping("/sotrudniki")
    public String getMainPageEmployee(Authentication authentication,
                              @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main_employees";
    }
    @GetMapping("/contact")
    public String getMainPagecontact(Authentication authentication,
                                      @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main_contact";
    }
    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
//    @GetMapping("/search")
//    public String getSearchPage(@ModelAttribute("model") ModelMap model,
//                                Authentication authentication,
//                                @RequestParam("search") String search) {
//
//        if (authentication != null) {
//            User user = authenticationService.getUserByAuthentication(authentication);
//            model.addAttribute("user", user);
//        }
//        model.addAttribute("search", search);
//        Eservice eservice = eServices.findByName(search);
//        model.addAttribute("eservice", eservice);
//        return "search";
//    }

}