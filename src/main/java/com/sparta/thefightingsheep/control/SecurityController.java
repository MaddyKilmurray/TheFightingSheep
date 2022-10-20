package com.sparta.thefightingsheep.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        return "login";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/accessdenied")
    public String accessDenied(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    @GetMapping("/")
    public String main(Model model) { return "Main"; }
}
