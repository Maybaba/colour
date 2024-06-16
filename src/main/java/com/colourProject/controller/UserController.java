package com.colourProject.controller;

import com.colourProject.entity.User;
import com.colourProject.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/index")
@Slf4j
public class UserController {
    //의존성 주입
    private final UserService userService;

    @GetMapping("/index")
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        log.info("Access into server");
        return "users/user";
    }

    @PostMapping("/index")
    public String addUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        userService.registerUser(user);
        return "redirect:index";
    }
}