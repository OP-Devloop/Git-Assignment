package se.iths.oscarp.vblesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.vblesson2.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }


    @GetMapping
    public String Home(Model model) {
        model.addAttribute("message", "Hello from service");
        return "index";
    }
}
