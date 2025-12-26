package com.profile.myprofile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String showProfile(Model model) {
        model.addAttribute("pageTitle", "My Profile");
        return "profile"; // Trả về file templates/ai-tools.html
    }
}
