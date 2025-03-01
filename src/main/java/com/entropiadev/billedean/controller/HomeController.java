package com.entropiadev.billedean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appName", "Mi Aplicación Web");
        return "landing/index"; // Busca el archivo index.html en src/main/resources/templates/
    }
}

