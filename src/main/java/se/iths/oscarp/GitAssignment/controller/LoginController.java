package se.iths.oscarp.GitAssignment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Value("${dummy.username}")
    private String dummyUsername;

    @Value("${dummy.password}")
    private String dummyPassword;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        if (dummyUsername.equals(username) && dummyPassword.equals(password)) {
            return "redirect:/";
        }

        model.addAttribute("error", "Invalid username or password try again");
        return "login";
    }
}
