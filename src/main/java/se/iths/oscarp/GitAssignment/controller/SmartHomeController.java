package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.GitAssignment.model.SmartHome;
import se.iths.oscarp.GitAssignment.service.SmartHomeService;

import java.util.List;

@Controller
@RequestMapping("/smarthome")
public class SmartHomeController {

    private final SmartHomeService smartHomeService;

    public SmartHomeController(SmartHomeService smartHomeService) {
        this.smartHomeService = smartHomeService;
    }

    @GetMapping
    public String SmartHome(Model model) {
        List<SmartHome> smartHomeList = smartHomeService.SmartHomeList();
        model.addAttribute("shList", smartHomeList);
        return "smarthome";
    }
}
