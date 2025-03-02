package com.entropiadev.billedean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "Login/Login"; // Este es el nombre de la plantilla, sin la extensión .html
    }
}
