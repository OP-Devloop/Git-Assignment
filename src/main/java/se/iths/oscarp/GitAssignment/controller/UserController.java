package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.GitAssignment.model.User;
import se.iths.oscarp.GitAssignment.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String user(Model model) {
        List<User> users = userService.userList();
        model.addAttribute("user", users);
        return "user";
    }
}
