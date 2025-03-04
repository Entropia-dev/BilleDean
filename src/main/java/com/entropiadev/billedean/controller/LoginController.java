package com.entropiadev.billedean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login") // La URL debe coincidir con el href
    public String showLoginPage() {
        return "Login/login"; // Thymeleaf buscará en templates/Login/login.html
    }
}
