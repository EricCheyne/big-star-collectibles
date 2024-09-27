package com.cheyne.collectibles.controllers;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String displayHomePage(Model model) {
        return "index";

    }
}
