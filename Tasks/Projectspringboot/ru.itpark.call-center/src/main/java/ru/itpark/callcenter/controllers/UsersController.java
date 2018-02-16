package ru.itpark.callcenter.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.callcenter.forms.NamesForm;
import ru.itpark.callcenter.models.Services;
import ru.itpark.callcenter.models.User;
import ru.itpark.callcenter.services.AuthenticationService;
import ru.itpark.callcenter.services.RegistrationServices;
import ru.itpark.callcenter.services.UsersService;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/profile")
    public String getProfilePage(
            @ModelAttribute("model") ModelMap model,
            Authentication authentication) {
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "profile";
    }

//    @GetMapping(value = "/usersearch")
//    public String getSearchePage(Authentication authentication,
//            @ModelAttribute("model") ModelMap model) {
//        if (authentication != null) {
//            User user = authenticationService.getUserByAuthentication(authentication);
//            model.addAttribute("user", user);
//
//        }
//        return "search_user";
//    }

    @GetMapping(value = "/users")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<User> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "users_page";
    }





    @GetMapping("/users/{user-id}")
    public String getUserPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("user-id") Long userId) {
        User user = service.getUser(userId);
        model.addAttribute("user", user);
        return "user_page";
    }

    @PostMapping("/users/{user-id}")
    @ResponseBody
    public ResponseEntity<Object> updateUser(@PathVariable("user-id") Long userId,
                                             NamesForm form) {
        service.update(userId, form);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/all/users/{user-id}")
    @ResponseBody
    public ResponseEntity<User> getUser(@PathVariable("user-id") Long userId) {
        return ResponseEntity.ok(service.getUser(userId));
    }
}
